package pl.sda.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.repository.QuestRepository;
import pl.sda.demospring.domain.repository.WorriorRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    WorriorRepository worriorRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();


    public void assignRandomQuest(String worriorName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        worriorRepository.getWorrior(worriorName).ifPresent(worrior -> worrior.setQuest(randomQuest));
        questRepository.deleteQuest(randomQuest);
    }

}
