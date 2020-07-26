package shishayspringframework.jockapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shishayspringframework.jockapp.model.Jock;

@Service
public class ChuckNorrisJockService implements JockService{

    @Autowired
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJockService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJock() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
