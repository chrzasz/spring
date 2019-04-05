package pl.sda.demospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.sda.demospring.domain.Castle;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.Worrior;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
@PropertySource("classpath:castle.properties")
public class MainConfig {

    @Bean
    public Quest createQuest() {
        return new Quest();
    }

    @Bean
    public Worrior worrior() {
        Worrior worrior = new Worrior("Zerg", 78);
        worrior.setQuest(createQuest());
        return worrior;
    }

    @Bean
    @Value("${my.castle.name:Head Quarter}")
    public Castle castle(String name) {
        Castle castle = new Castle(worrior());
        castle.setName(name);
        return castle;
    }


}
