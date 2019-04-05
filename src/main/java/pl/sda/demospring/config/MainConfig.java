package pl.sda.demospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.Worrior;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
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

}
