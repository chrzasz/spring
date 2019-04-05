package pl.sda.demospring.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "Mordor";

    public Castle() {

    }

    @PostConstruct
    public void build() {
        System.out.println(name + " has been build");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(name + " is to be destroyed");
    }
}
