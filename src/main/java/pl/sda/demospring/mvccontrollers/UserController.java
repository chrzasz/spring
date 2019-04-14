package pl.sda.demospring.mvccontrollers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.services.WorriorService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final WorriorService worriorService;

    @GetMapping("/user")
    public String user8746131331(Model model) {
        model.addAttribute("atr", "1234"); //1234-wartosc przekazywana na frontend
        List<Worrior> worriorList = worriorService.getAllWorriors();
        model.addAttribute("worriors", worriorList);
        return "user"; //this is html file name
    }
}
