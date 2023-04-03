package MavenCMDtest;

import org.testng.annotations.Test;

public class Parameter {

	@Test
	public void TC_01()
	{
		String URL = System.getProperty("url");
		System.out.println(URL);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String USERNAME = System.getProperty("username");
		System.out.println(USERNAME);
		String PASSWORD = System.getProperty("password");
		System.out.println(PASSWORD);
	}
}
