package com.github.draylar;


public class Main {

    private static Anthology anthology = new Anthology();

    private static final Author RALPH_EMERSON = new Author("Ralph", "Emerson", "May 25th, 1803");
    private static final Author NELSON_MANDELA = new Author("Nelson", "Mandela", "July 18th, 1918");
    private static final Author ELEANOR_ROOSEVELT = new Author("Eleanor", "Roosevelt", "October 11th, 1884");

    static {
        anthology.addQuote(new Quote(RALPH_EMERSON, "Trust thyself: every heart vibrates to that iron string."));
        anthology.addQuote(new Quote(RALPH_EMERSON, "What lies behind you and what lies in front of you, pales in comparison to what lies inside of you."));
        anthology.addQuote(new Quote(RALPH_EMERSON, "Nature always wears the colors of the spirit."));
        anthology.addQuote(new Quote(NELSON_MANDELA, "The greatest glory in living lies not in never falling, but in rising every time we fall"));
        anthology.addQuote(new Quote(ELEANOR_ROOSEVELT, "If life were predictable it would cease to be life, and be without flavor."));
    }

    public static void main(String[] args) {
        System.out.println("Random quote: ");
        printQuote(anthology.getRandomQuote());

        System.out.println("\nRandom Ralph Emerson quote, by author object: ");
        printQuote(anthology.getRandomQuote(RALPH_EMERSON));

        System.out.println("\nRandom Ralph Emerson quote, by first name: ");
        printQuote(anthology.getRandomQuote(RALPH_EMERSON.getFirstName()));

        System.out.println("\nAll quotes:");
        anthology.getQuotes().forEach(Main::printQuote);
    }


    /**
     * Prints out the given quote to the console.
     * Format is:
     *   Quote
     *   -  Author, Date of birth
     * @param quote quote to print to console
     */
    private static void printQuote(Quote quote) {
        System.out.println(quote.getQuoteText());
        System.out.println(" -" + quote.getAuthor().getFullName() + ", born " + quote.getAuthor().getBirth());
    }
}
