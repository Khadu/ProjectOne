public class NumberWords {
	

	public String toWords( int n ) {
		String str="";

		if(n==0)
		{
			System.out.println("Exiting the System");

			System.exit(1);

		}
		else if (n < 0)
		{
			
			str=str.concat("Number out of range");

//			System.out.println("Enter numbers greater than 0");
		}
		else if (n>200000000)
		{
			
			str=str.concat("Number out of range");

//			System.out.println("Enter numbers greater than 0");
		}
		else
		{
			NumberWordsApplication a = new NumberWordsApplication();
			str=str.concat(a.pw((n / 1000000000), " Hundred"));
			str=str.concat(a.pw((n / 10000000) % 100, " crore"));
			str=str.concat(a.pw(((n / 100000) % 100), " lakh"));
			str=str.concat(a.pw(((n / 1000) % 100), " thousand"));
			str=str.concat(a.pw(((n / 100) % 10), " hundred"));
			str=str.concat(a.pw((n % 100), " "));
		}
		System.out.println(str.trim());
		return str.trim() ;
	}

}
