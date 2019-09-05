package com.github.draylar;

class Quote {

    private Author author;
    private String quoteText;

    Quote(Author author, String quoteText) {
        this.author = author;
        this.quoteText = quoteText;
    }

    Author getAuthor() {
        return author;
    }

    String getQuoteText() {
        return quoteText;
    }
}
