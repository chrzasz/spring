package pl.sda.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.repository.QuestRepository;
import pl.sda.demospring.domain.repository.WorriorRepository;
import pl.sda.demospring.services.QuestService;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    WorriorRepository worriorRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... args) throws Exception {

        questRepository.createRandomQuests();
        System.out.println(questRepository);
        questRepository.createRandomQuests();
        System.out.println(questRepository);
        questRepository.createRandomQuests();
        System.out.println(questRepository);

        questService.assignRandomQuest("Goliat");
        questService.assignRandomQuest("Protos");
        questService.assignRandomQuest("David");

        System.out.println(worriorRepository);
    }
}
