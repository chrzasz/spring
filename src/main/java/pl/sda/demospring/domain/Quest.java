package pl.sda.demospring.domain;

public class Quest {

    private String description;

    public Quest() {
        this.description = "default quest";
    }

    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }
}
