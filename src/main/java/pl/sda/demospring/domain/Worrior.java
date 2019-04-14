package pl.sda.demospring.domain;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel(value = "Worrior model")
public class Worrior {

    private int id;
    private String name;
    private int age;
    private int level;
    private Quest quest;

}
