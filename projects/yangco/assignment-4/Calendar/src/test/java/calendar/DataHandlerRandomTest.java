package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {

    /**
     * Generate Random Tests that tests DataHandler Class.
     */
		private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
		private static final int NUM_TESTS=100;
	 @Test
	  public void randomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
 	 	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;




 	 	for(int i = 0; elapsed < TestTimeout; i++)
 	 	{
 	 		DataHandler handler = new DataHandler();
 	 		Random random = new Random();

 			GregorianCalendar calendarTest1 = new GregorianCalendar();
 			CalDay day = new CalDay(calendarTest1);


 	 		Appt appt = new Appt(5, 5, 5, 5, 2, "test", "test", "test@emali.com");


 	 		for(int j = 0; j < NUM_TESTS; j++)
 	 		{


 	 			for(int k = 0; k < 15; k++)
 	 			{
 	 				appt.setStartMinute(random.nextInt(80)-5);
 	 				appt.setStartHour(random.nextInt(80)-5);
 	 				appt.setStartDay(random.nextInt(80)-5);
 	 				appt.setStartMonth(random.nextInt(80)-5);

 	 				day.addAppt(appt);
 	 			}

 	 				appt.setStartMinute(random.nextInt(80)-5);
 	 				appt.setStartHour(random.nextInt(80)-5);
 	 				appt.setStartDay(random.nextInt(80)-5);
 	 				appt.setStartMonth(random.nextInt(80)-5);

 	 			handler.deleteAppt(appt);




 	 		}

 	 		appt.setStartMinute(8);
 	 		appt.setStartHour(8);
 	 		appt.setStartDay(8);
 			appt.setStartMonth(8);


 			Appt appt1 = new Appt(5, 5, 5, 5, 2, "test", "test", "test@email.com");


 	 		GregorianCalendar calendarTest = new GregorianCalendar();
 			CalDay day1 = new CalDay(calendarTest);

 			day1.addAppt(appt);

 			handler.deleteAppt(appt1);
 	 		handler.deleteAppt(null);

 	 		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 			        if((i%10000)==0 && i!=0 )
 			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
 	 	}


	 }



}
