package core;

import java.util.StringTokenizer;

public class StringTokenizerExample1
{
	public static void main(String[] args) 
	{
		String message ="How to split String in Java using String Tokenizer";
		/*We have passed message to our st object,
		 * which splits the String based on spaces(default delimiter) 
		 */
		StringTokenizer st = new StringTokenizer(message);
		/*hasMoreTokens methods returns a boolean which is used to 
		 * check if there exist a next token 
		 */
		while(st.hasMoreTokens())
		{
			//nextToken fetches you splitted String
			System.out.println(st.nextToken());
		}
	}
}