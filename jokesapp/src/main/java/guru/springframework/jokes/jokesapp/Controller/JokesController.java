package guru.springframework.jokes.jokesapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokes.jokesapp.Services.JokeService;

@Controller
public class JokesController {

	private JokeService jokeService;

	//@Autowired
	public JokesController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model ) {
		
		model.addAttribute("joke",jokeService.getJoke());
		return "chucknorris";
	}
}
