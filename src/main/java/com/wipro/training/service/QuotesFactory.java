package com.wipro.training.service;

public class QuotesFactory {

    public QuoteService quoteService(String character) {
        QuoteService quoteService;

        switch (character) {
            case "ty":
                quoteService = new QuoteServiceTyrionImpl();
                break;
            default:
                throw new UnknownCharacterException();
        }

        return quoteService;
    }
}
