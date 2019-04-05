package pl.sda.demospring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Worrior {

    private String name;
    private int age;
    private Quest quest;

    public Worrior() {
        this.name = "Default Worrior";
        this.age = 22;
    }

    public Worrior(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Setting quest");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Worrior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quest=" + quest +
                '}';
    }
}
