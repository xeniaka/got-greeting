package com.wipro.training.gotgreeting;

import com.wipro.training.controller.QuoteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wipro.training")
public class GotGreetingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(GotGreetingApplication.class, args);

        QuoteController controller = context.getBean(QuoteController.class);
        controller.saySomething();
    }

}

