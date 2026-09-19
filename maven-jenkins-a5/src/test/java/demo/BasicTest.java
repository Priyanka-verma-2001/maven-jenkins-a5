package demo;

import org.testng.annotations.Test;

public class BasicTest {
	@Test
	public void OnlyPrint() {
		System.out.println("This is only for printing this text.");
	}

	@Test
	public void PersonalInfo() {
		System.out.println("Automation Test Enginner for QSpider");
	}

}
