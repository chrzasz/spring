package pl.sda.demospring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("classpath:castle.properties")
public class Castle {

    @Value("${my.castle.name:Mordor}")
    private String name;


    Worrior worrior;

    @Autowired
    public Castle(Worrior worrior) {
        this.worrior = worrior;
    }

    @PostConstruct
    public void build() {
        System.out.println(name + " has been build");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(name + " is to be destroyed");
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                ", worrior=" + worrior +
                '}';
    }
}
