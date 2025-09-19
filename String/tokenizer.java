package string;
import java.util.StringTokenizer;
public class tokenizer {
    public static void main(String[] args) {
        String string = "Kunal Yadav";
        StringTokenizer st = new StringTokenizer(string);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}

/**
 * StringTokenizer is a legacy class in Java (java.util package) used to split a string into tokens.
 * Tokens are substrings separated by delimiters (like space, comma, etc.).
 * Each call to nextToken() returns the next token in the string.
 * Note: Since Java 1.4, String.split() and regex are recommended, but StringTokenizer is still widely used for simple tokenizing tasks.
 */
