package com.github.draylar;

public class Author {

    private String firstName;
    private String lastName;
    private String birth;

    Author(String firstName, String lastName, String birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    /**
     * Returns the full name of the author, which is the first and last name combined.
     * An author with a first name of James and a last name of Thompson would have James Thompson as their full name.
     * @return full name of the author
     */
    String getFullName() {
        return firstName + " " + lastName;
    }

    String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the date of birth of the author, stored as a string.
     * Format is Month/Day/Year fully formatted, such as:
     *    "May 17th, 1997"
     * @return author's date of birth
     */
    String getBirth() {
        return birth;
    }
}
