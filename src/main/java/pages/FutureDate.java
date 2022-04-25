package pages;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class FutureDate {
	
	WebDriver driver;
	
	public void Calendar(){ 
		
		Random rand = new Random();
		int randValue =  rand.nextInt(5);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 10);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.YEAR, 1);
		
		Date d = cal.getTime();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String dateString=sdf.format(d);
		System.out.println(dateString);
	}

}
