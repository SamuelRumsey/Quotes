package com.github.draylar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Anthology {

    private ArrayList<Quote> quotes = new ArrayList<>();
    private Random random = new Random();

    public List<Quote> getQuotes() {
        return quotes;
    }

    void addQuote(Quote quote) {
        this.quotes.add(quote);
    }

    /**
     * Retrieves a random quote from the anthology with no search filters.
     * @return random anthology quote
     */
    Quote getRandomQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }

    /**
     * Retrieves a random quote from the anthology, filtered by author.
     * @param author author to filter by
     * @return random quote by the filtered author
     */
    Quote getRandomQuote(Author author) {
        ArrayList<Quote> validQuoteList = new ArrayList<>();
        quotes.stream().filter(quote -> quote.getAuthor().equals(author)).forEach(validQuoteList::add);
        return validQuoteList.get(random.nextInt(validQuoteList.size()));
    }

    /**
     * Retrieves a random quote from the anthology, filtered by author first name.
     * @param authorFirstName author first name to filter by
     * @return random quote by the filtered first name
     */
    Quote getRandomQuote(String authorFirstName) {
        ArrayList<Quote> validQuoteList = new ArrayList<>();
        quotes.stream().filter(quote -> quote.getAuthor().getFirstName().equals(authorFirstName)).forEach(validQuoteList::add);
        return validQuoteList.get(random.nextInt(validQuoteList.size()));
    }
}
