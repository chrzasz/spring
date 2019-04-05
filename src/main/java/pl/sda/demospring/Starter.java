package pl.sda.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.Castle;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.Worrior;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        Quest protectComrade = new Quest("Protect comrade");
        Worrior orc = new Worrior("Buba", 20, protectComrade);
        System.out.println(orc);
        Quest killOrc = new Quest("Kill Orc");
        Worrior human = new Worrior("Greg", 35,killOrc);
        System.out.println(human);
        Worrior wizzard = new Worrior("Oz",42);
        System.out.println(wizzard);
        Quest teleport = new Quest("Teleport");
        wizzard.setQuest(teleport);
        System.out.println(wizzard);

    }
}
