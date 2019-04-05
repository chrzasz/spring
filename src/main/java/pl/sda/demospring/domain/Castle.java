package pl.sda.demospring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    @Value("Mordor")
    private String name;

    @Autowired
    Worrior worrior;

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

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                ", worrior=" + worrior +
                '}';
    }
}
