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


    }
}
