package pl.sda.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.repository.QuestRepository;
import pl.sda.demospring.domain.repository.WorriorRepository;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    WorriorRepository worriorRepository;

    @Autowired
    QuestRepository questRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(worriorRepository);
        System.out.println(questRepository);


    }
}
