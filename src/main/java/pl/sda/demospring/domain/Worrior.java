package pl.sda.demospring.domain;

public class Worrior {

    private String name;
    private int age;
    private Quest quest;



    public Worrior(String name, int age) {
        this.name = name;
        this.age = age;
        this.quest = new Quest("Protect comrade");
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
