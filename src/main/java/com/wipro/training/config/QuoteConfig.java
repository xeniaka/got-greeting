package com.wipro.training.config;

import com.wipro.training.service.QuoteService;
import com.wipro.training.service.QuotesFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class QuoteConfig {

    @Bean
    public QuotesFactory quotesFactory() {
        return new QuotesFactory();
    }

    @Bean
    @Profile("tyrion")
    public QuoteService quoteServiceTyrionImpl(QuotesFactory quotesFactory) {
        return quotesFactory.quoteService("ty");
    }

}
