

import org.junit.*;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords(-1) ) ;
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords(200000006) ) ;
	}
	@Test
	public void properNUmber() {
		Assert.assertEquals( "Success", "Forty Five", numberWords.toWords(45) ) ;
	}	
//	@Test
//	public void exitCommand() {
//		Assert.assertEquals( "Success", "Exiting the System", numberWords.toWords(0) ) ;
//	}	
	
	

}
