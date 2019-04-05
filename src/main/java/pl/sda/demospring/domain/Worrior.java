package pl.sda.demospring.domain;

public class Worrior {

    private String name;
    private int age;

    public Worrior(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worrior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
