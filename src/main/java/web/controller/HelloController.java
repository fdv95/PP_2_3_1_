package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        String messages = "Show all users";
        model.addAttribute("messages", messages);
        return "index";
    }

}