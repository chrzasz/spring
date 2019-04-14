package pl.sda.demospring.mvccontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String user8746131331(Model model) {
        model.addAttribute("atr", "1234"); //1234-wartosc przekazywana na frontend
        return "user"; //this is html file name
    }
}
