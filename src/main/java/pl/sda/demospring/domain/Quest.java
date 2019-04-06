package pl.sda.demospring.domain;

public class Quest {

    private String description;


    public Quest() {
        this.description = "default quest";
    }

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Quest{" +
                "description='" + description + '\'' +
                '}';
    }
}
