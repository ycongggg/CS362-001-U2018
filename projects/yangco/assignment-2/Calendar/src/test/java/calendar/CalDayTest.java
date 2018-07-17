/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    CalDay day = new CalDay();
		assertEquals(false, day.isValid());

    GregorianCalendar calendarTest = new GregorianCalendar();
		CalDay day1 = new CalDay(calendarTest);
    assertEquals(calendarTest.get(calendarTest.DAY_OF_MONTH), day1.day);
		assertEquals(true, day1.isValid());
    day1.toString();
		day1.getSizeAppts();
    day1.iterator();
		day.toString();
		day.iterator();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Appt test = new Appt(5, 6, 6, 5, 5, "camping", "going camping", "abc@email.com");
		Appt test1 = new Appt(9, 9, 9, 9, 9, "work,", "go to work", "abc@email.com");
		Appt test2 = new Appt(25, 50, 60, 9, 9, "work,", "go to work", "abc@email.com");
		Appt test3 = new Appt(7, 7, 7, 7, 7, "work,", "go to work", "abc@email.com");
		Appt test4 = new Appt(6, 6, 7, 7, 7, "fun", "have fun!", "abc@email.com");

		GregorianCalendar calendarTest = new GregorianCalendar();
		CalDay day = new CalDay(calendarTest);
		day.addAppt(test);
		day.addAppt(test1);
		day.addAppt(test2);
		day.addAppt(test4);
		day.toString();
  }

}
