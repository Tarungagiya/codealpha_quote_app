package com.example.quote;

public class QuoteLists {

    private final String quote;
    private final String author;

    public QuoteLists(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
