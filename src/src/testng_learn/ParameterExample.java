package testng_learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	@Test 
	@Parameters("Name")
	public void printname(String k) {
		System.out.println("Name is : "+ k);
	}

}
