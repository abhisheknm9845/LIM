package MavenCMDtest;

import org.testng.annotations.Test;

public class calss1 {
	@Test(groups = "regression")
	public void maven()
	{
		System.out.println("maven should be there");
	}
	@Test(groups = "regression")
	public void command()
	{
		System.out.println("command should be there");
	}
	

}
