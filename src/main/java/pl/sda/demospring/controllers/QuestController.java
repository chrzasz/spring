package pl.sda.demospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.services.QuestService;
import pl.sda.demospring.services.WorriorService;

import java.util.List;

@Controller
public class QuestController {

    @Autowired
    WorriorService worriorService;

    @Autowired
    QuestService questService;

    @RequestMapping("/assignQuest")
    public String assignQuest(@RequestParam("worriorId") Integer id, Model model) {
        Worrior worrior = worriorService.getWorrior(id);
        List<Quest> notStartedQuests = questService.getAllNotStatredQuest();
        model.addAttribute("worrior", worrior);
        model.addAttribute("notStartedQuests", notStartedQuests);
        return "assignQuest";

    }
}
