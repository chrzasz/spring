package pl.sda.demospring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
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
