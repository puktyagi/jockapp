package shishayspringframework.jockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import shishayspringframework.jockapp.controller.JockController;

import javax.naming.Context;

@SpringBootApplication
@ComponentScan(basePackages = {"config", "shishayspringframework.jockapp"})
public class JockappApplication {

    public static void main(String[] args) {
       ApplicationContext t =  SpringApplication.run(JockappApplication.class, args);

    }

}
