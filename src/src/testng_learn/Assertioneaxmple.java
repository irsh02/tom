package testng_learn;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertioneaxmple {
	
	String expected= "Green colour";
	

	String colour;
	@Test
	public void colourpainted() {
		colour="Green colour";
		
		System.out.println("Atual colour painted :"+ colour);
	
		Assert.assertEquals(colour,expected);
		
		System.out.println("Expected colour is: " + expected );
	}
	@Test
	public void colourpaintedverify() {
		colour="Green shade colour";
		System.out.println("Atual colour painted :"+ colour);
		SoftAssert assert1= new SoftAssert();
		assert1.assertEquals(colour,expected );
		System.out.println("Expected colour is: " + expected );
		
	}
	
	
	
}
