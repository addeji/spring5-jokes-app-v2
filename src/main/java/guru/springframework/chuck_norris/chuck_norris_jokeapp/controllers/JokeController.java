package guru.springframework.chuck_norris.chuck_norris_jokeapp.controllers;

import guru.springframework.chuck_norris.chuck_norris_jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke", this.jokeService.getJoke());
        return "index";

    }
}
