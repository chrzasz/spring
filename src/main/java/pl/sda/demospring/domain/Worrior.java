package pl.sda.demospring.domain;

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

    public void setQuest(Quest quest) {
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
