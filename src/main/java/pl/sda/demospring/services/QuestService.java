package pl.sda.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.repository.QuestRepository;
import pl.sda.demospring.domain.repository.WorriorRepository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuestService {

    @Autowired
    WorriorRepository worriorRepository;

    QuestRepository questRepository;

    @Autowired
    public void setQuestRepository(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    final static Random rand = new Random();

    public void assignRandomQuest(String worriorName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        worriorRepository.getWorrior(worriorName).ifPresent(worrior -> worrior.setQuest(randomQuest));
    }

    public List<Quest> getAllNotStatredQuest() {
        return questRepository.getAll().stream().filter(quest -> !quest.isStarted()).collect(Collectors.toList());
    }

}
