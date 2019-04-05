package pl.sda.demospring.domain;

public class Worrior {

    private String name;
    private int age;
    private Quest quest;

    public Worrior() {
    }

    public Worrior(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
