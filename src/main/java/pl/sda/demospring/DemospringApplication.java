package pl.sda.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sda.demospring.domain.Castle;

@SpringBootApplication
public class DemospringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemospringApplication.class, args);
        Castle castle = (Castle)ctx.getBean("castle");
        System.out.println(castle);
    }

}
