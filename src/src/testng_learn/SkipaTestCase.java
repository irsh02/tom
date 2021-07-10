package testng_learn;

import org.testng.annotations.Test;

public class SkipaTestCase {
	@Test(priority = 0)
	public void startacar(){
		System.out.println("start the car");
	}
	@Test(priority = 1)
	public void putfirstgear(){
		System.out.println("put first gear");
	}
	@Test(priority = 5,enabled = false)
	public void putmusic(){
		System.out.println("Turn on music");
	}
	@Test(priority = 2)
	public void putsecondgear(){
		System.out.println("put second gear");
	}
	@Test(priority = 3)
	public void putthirdgear(){
		System.out.println("put third gear");
	}
	@Test(priority = 4)
	public void putfourthgear(){
		System.out.println("put fourth gear");
	}

}
