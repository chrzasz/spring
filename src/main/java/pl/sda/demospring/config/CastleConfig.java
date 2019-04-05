package pl.sda.demospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import pl.sda.demospring.domain.Castle;

@Configuration
@PropertySource("classpath:castle.properties")
@Import(MainConfig.class)
public class CastleConfig {

    @Bean(name = "bean", initMethod = "build", destroyMethod = "destroy")
    @Value("${my.castle.name:Head Quarter}")
    public Castle castle(String name) {
        Castle castle = new Castle(worrior());
        castle.setName(name);
        return castle;
    }

}
