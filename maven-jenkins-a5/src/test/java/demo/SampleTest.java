package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void case1() {
		System.out.println("case1 from SampleTest");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.naukri.com/registration/createAccount?othersrcp=571&wExp=N&srcTemplate=registerfree468x60&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cFM6b4_Tkh-QUnn-bhlQEQxT&gclid=EAIaIQobChMIu_Lcxa60lgMV-W0PAh2XEDsDEAAYASAAEgKn2_D_BwE");

		driver.findElement(
				By.cssSelector("img[src='//static.naukimg.com/s/7/104/assets/images/briefcase.bdc5fadf.svg']")).click();

		driver.findElement(By.id("resumeUpload")).sendKeys("/Users/priyankaverma/Downloads/Resume 2.pdf");

	}
}
