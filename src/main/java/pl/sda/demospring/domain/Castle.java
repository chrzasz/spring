package pl.sda.demospring.domain;

public class Castle {

    private String name;

    Worrior worrior;

    public Castle(Worrior worrior) {
        this.worrior = worrior;
    }

    Castle(String name, Worrior worrior) {
        this.name = name;
        this.worrior = worrior;
    }

    public void build() {
        System.out.println(name + " has been build");
    }

    public void destroy() {
        System.out.println(name + " is to be destroyed");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                ", worrior=" + worrior +
                '}';
    }
}
