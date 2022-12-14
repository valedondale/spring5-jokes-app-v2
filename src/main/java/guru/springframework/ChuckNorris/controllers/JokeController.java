package guru.springframework.ChuckNorris.controllers;

import guru.springframework.ChuckNorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String openPage(Model model){
        model.addAttribute("randomquote",jokeService.getRandomQuote());
        return "jokelist";
    }
}
