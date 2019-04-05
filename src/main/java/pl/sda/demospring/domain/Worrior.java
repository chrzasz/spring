package pl.sda.demospring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worrior {

    private String name = "Greg";
    private int age = 18;
    private Quest quest;

    public Worrior() {
    }

    //    public Worrior(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

    public Worrior(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void setQuest(Quest quest) {
//        this.quest = quest;
//    }

    @Override
    public String toString() {
        return "Worrior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
