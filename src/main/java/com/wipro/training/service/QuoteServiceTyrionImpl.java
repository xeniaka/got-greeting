package com.wipro.training.service;

import org.springframework.beans.factory.annotation.Value;

public class QuoteServiceTyrionImpl implements QuoteService {

    @Value("${character.subject}")
    private String subject;

    @Override
    public String quote() {
        String quote = null;
        if ("drinking".equals(subject)) {
            quote = "It’s not easy being drunk all the time. If it were easy, everyone would do it.";
        }
        return quote;
    }
}
