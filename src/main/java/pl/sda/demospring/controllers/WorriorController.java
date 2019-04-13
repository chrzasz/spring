package pl.sda.demospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.demospring.components.TimeComponent;
import pl.sda.demospring.domain.PlayerInformation;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.services.WorriorService;

import java.util.List;

@Controller
public class WorriorController {

    @Autowired
    PlayerInformation playerInformation;

    @Autowired
    TimeComponent timeComponent;

    @Autowired
    WorriorService service;

    @RequestMapping("/worriors")
    public String getWorriors(Model model) {
        List<Worrior> allWoriors = service.getAllWorriors();
        model.addAttribute("worriors", allWoriors);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("playerinformation", playerInformation);
        return "worriors";
    }

    @RequestMapping("/add")
    public String createWorrior(Model model) {
        model.addAttribute("worrior", new Worrior());
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("playerinformation", playerInformation);
        return "worriorform";
    }

    @RequestMapping(value = "/worriors", method = RequestMethod.POST)
    public String addWorrior(Worrior worrior) {
        service.saveWorrior(worrior);
        return "redirect:/worriors";
    }

    @RequestMapping("/worrior")
    public String getWorrior(@RequestParam("id") Integer id, Model model) {
        Worrior worrior = service.getWorrior(id);
        model.addAttribute("worrior", worrior);
        model.addAttribute("timecomponent", timeComponent);
        model.addAttribute("playerinformation", playerInformation);
        return "worrior";
    }

    @RequestMapping(value = "/worrior/delete/{id}")
    public String deleteWorrior(@PathVariable("id") Integer id) {
        service.deleteWorrior(id);
        return "redirect:/worriors";
    }
}
