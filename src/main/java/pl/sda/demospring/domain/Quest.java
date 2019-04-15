package pl.sda.demospring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Quest {

    private String description;
    private int reward = 100;
    private int lenght = 30000;
    private boolean started = false;
    private boolean completed = false;


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
