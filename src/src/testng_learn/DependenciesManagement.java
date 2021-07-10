package testng_learn;

import org.testng.annotations.Test;

public class DependenciesManagement {
//probem1: you have to admit a student to engineering 
	//for which he should pass @test higher secondary school
//probem1: you have to admit a student to higher secondary school
	 //for which he should pass @test state matriculation school	
	
	@Test(enabled = true)
	public void matricschool() {
		System.out.println("passed 10th");
	}
	@Test(dependsOnMethods = "matricschool" )
	public void highersecondaryschool() {
		System.out.println("passed 12th");
	}
	@Test(dependsOnMethods = "highersecondaryschool")
	public void engineering() {
		System.out.println("Graduate B.E");
	}
}
