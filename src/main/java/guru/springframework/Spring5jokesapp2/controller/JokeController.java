package guru.springframework.Spring5jokesapp2.controller;

import guru.springframework.Spring5jokesapp2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokesService jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
    @RequestMapping({"/",""})
    public String showJoke (Model model){
        model.addAttribute("joke",jokesService.getJoke() );
        return "index";
    }
}
