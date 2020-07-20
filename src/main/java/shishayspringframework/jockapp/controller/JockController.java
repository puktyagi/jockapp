package shishayspringframework.jockapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shishayspringframework.jockapp.model.Jock;
import shishayspringframework.jockapp.service.JockService;

@Controller
public class JockController {

    private final JockService jockService;

    public JockController(JockService jockService) {
        this.jockService = jockService;
    }

    @RequestMapping({"/",""})
    public String getChuckNorrisQuotes(Model model)
    {
       Jock j = new Jock();
       j.setJock(jockService.getJock());
        model.addAttribute("randomjock", j);
        return "jocks/chuckjock";
    }



}
