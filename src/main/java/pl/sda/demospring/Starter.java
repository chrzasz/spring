package pl.sda.demospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.Worrior;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Worrior orc = new Worrior("Buba", 20);

        System.out.println(orc);

    }
}
