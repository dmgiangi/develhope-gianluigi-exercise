package it.develhope.gianluigi.javadoc01;

/**
 * this class manipulates String
 *
 * @author Gianluigi De Marco
 */
public class WordGames {
    /**
     * This method return the string "Hello " concatenated with the string in the parameter word
     *
     * @param word String to concatenate
     * @return A concatenated String made with the string "Hello " and the content of the String word
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * This method return the full name of a person concatenating name and surname
     *
     * @param name the name of a person
     * @param surname the surname of a person
     * @return a concatenated String made with the parameter name, a white space and the parameter surname.
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}
