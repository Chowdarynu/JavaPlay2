package core;

import java.util.StringTokenizer;

public class StringTokenizerExample
{
	public static void main(String[] args) {
        String reverseMessage = "";
        String message = "Reverse String in Java using String Tokenizer";
        /*We have passed message to our st object,
         * which splits the String based on spaces(default delimiter)
         */
        StringTokenizer st = new StringTokenizer(message);
        /*hasMoreTokens methods returns a boolean which is used to
         * check if there exist a next token
         */
        while (st.hasMoreTokens()) {
            reverseMessage = st.nextToken() + " " + reverseMessage;
        }
        System.out.println("Original String is :" + message);
        System.out.println("Reversed String is :" + reverseMessage);
    }
}