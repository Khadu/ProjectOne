
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.*;


public final class NumberWordsApplication {
	private NumberWords numberWords ;
	private final BufferedReader reader ;
	public String pw(int n, String ch)
	{
		String result = "";
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			result=result.concat(ten[n / 10]+one[n % 10]);
//			System.out.print(ten[n / 10]+ one[n % 10]);
		}
		else
		{
			result=result.concat(one[n]);

//			System.out.print(one[n]);
		}
		if (n > 0)
			result=result.concat(ch);
//			System.out.print(ch);
			
		return result;
	}
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() throws IOException {
		while( true ) {
			try {
				System.out.println( "\nEnter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				if(number==0)
				{
					System.exit(1);
				}
				numberWords=new NumberWords();
				numberWords.toWords(number);
			} catch ( NumberFormatException e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
//		System.out.println("Running Test Cases");
//		Result result = JUnitCore.runClasses(NumberWordsTests.class);					
//		for (Failure failure : result.getFailures()) {							
//			System.out.println(failure.toString());					
//		}		
//		System.out.println("Result = "+result.wasSuccessful());
		new NumberWordsApplication().execute() ;
		
	}

}
