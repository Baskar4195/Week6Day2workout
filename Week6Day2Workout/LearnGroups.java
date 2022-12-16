 package Week6Day2Workout;

import org.testng.annotations.Test;

import testcase.BaseClass;

public class LearnGroups extends BaseClass {
	
	
	@Test(groups = "smoke")
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}

	@Test(groups = "sanity")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}

	@Test(groups = "regression")
	public void editLead() {
		System.out.println("Edit Lead");
	}

}
