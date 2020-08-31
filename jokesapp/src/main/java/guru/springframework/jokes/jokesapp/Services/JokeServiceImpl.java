package guru.springframework.jokes.jokesapp.Services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeServiceImpl() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes()  ;
	}


	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
