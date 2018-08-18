package calendar;


import org.junit.Test;


import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	 private static final int NUM_TESTS=100;
	 @Test
	  public void radnomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
 	 	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;



 	 	for(int i = 0; elapsed < TestTimeout; i++)
 	 	{


 	 		Random random = new Random();

 			GregorianCalendar calendarTest = new GregorianCalendar();
 			CalDay day = new CalDay(calendarTest);


 	 		Appt appt = new Appt(5, 5, 5, 5, 5, "test", "test", "test@emali.com");
 	 		Appt appt1 = new Appt(5, 23, 5, 5, 5, "test", "test", "test@emali.com");

 	 		for(int j = 0; j < NUM_TESTS; j++)
 	 		{
 	 			appt.setStartMinute(random.nextInt(80)-5);
 	 			appt.setStartHour(random.nextInt(80)-5);
 	 			appt.setStartDay(random.nextInt(80)-5);
 	 			appt.setStartMonth(random.nextInt(80)-5);

 	 			appt.setStartMinute(random.nextInt(80)-5);
 	 			appt.setStartDay(random.nextInt(80)-5);
 	 			appt.setStartMonth(random.nextInt(80)-5);

 	 			day.addAppt(appt);
 	 			day.addAppt(appt1);



 	 		}

 	 		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 			        if((i%10000)==0 && i!=0 )
 			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
 	 	}


	 }



}
