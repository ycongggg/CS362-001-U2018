/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    DataHandler table = new DataHandler();

	  	GregorianCalendar calendarTest = new GregorianCalendar(10,3,10);
		CalDay day = new CalDay(calendarTest);

		Appt test = new Appt(5, 6, 6, 5, 5, "camping", "going camping" ,"abc@email.com");
		Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work" ,"abc@email.com");
		Appt test2 = new Appt(25, 50, 60, 9, 9, "work,", "go to work" ,"abc@email.com");
		Appt test3 = new Appt(7, 7, 7, 7, 7, "work,", "go to work" ,"abc@email.com");
		Appt test4 = new Appt(6, 6, 6, 7, 7, "fun", "have fun!" ,"abc@email.com");
		Appt test5 = new Appt(13, 45, 6, 7, 7, "test", "test" ,"abc@email.com");


		day.addAppt(test);
		day.addAppt(test1);
		day.addAppt(test2);
		day.addAppt(test3);
		day.addAppt(test4);
		day.addAppt(test5);


		GregorianCalendar calendarTest1 = new GregorianCalendar(2,3,3);
		CalDay day1 = new CalDay(calendarTest1);


		day1.addAppt(test);
		day1.addAppt(test1);
		day1.addAppt(test2);
		day1.addAppt(test3);
		day1.addAppt(test4);

		LinkedList<CalDay> days = new LinkedList<CalDay>();


  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
