package shishayspringframework.jockapp.model;

import org.springframework.stereotype.Service;

@Service
public class Jock {
    private String jock;

    public String getJock() {
        return jock;
    }

    public void setJock(String jock) {
        this.jock = jock;
    }
}
