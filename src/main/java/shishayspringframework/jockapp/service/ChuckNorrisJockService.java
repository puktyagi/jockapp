package shishayspringframework.jockapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import shishayspringframework.jockapp.model.Jock;

@Service
public class ChuckNorrisJockService implements JockService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    ChuckNorrisJockService()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJock() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
