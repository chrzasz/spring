package pl.sda.demospring.mvccontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String user8746131331() {
        return "user"; //this is html file name
    }
}
