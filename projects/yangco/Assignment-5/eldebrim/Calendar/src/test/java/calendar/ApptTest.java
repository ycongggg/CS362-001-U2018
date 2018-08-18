/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      appt0.setValid();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals(0, appt0.getRecurIncrement());
      assertEquals("Birthday Party",appt0.getTitle());
      assertTrue(!appt0.getValid());





  }
@Test(timeout = 4000)
 public void test01()  throws Throwable  {
     Appt appt0 = new Appt(25, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test02()  throws Throwable  {
     Appt appt0 = new Appt(15, 66, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test03()  throws Throwable  {
     Appt appt0 = new Appt(15, 30, 9, 10, -1, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test04()  throws Throwable  {
     Appt appt0 = new Appt(15, 30, -1, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test05()  throws Throwable  {
     Appt appt0 = new Appt(-1, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test06()  throws Throwable  {
     Appt appt0 = new Appt(15, 30, 9, -1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test07()  throws Throwable  {
     Appt appt0 = new Appt(15, -1, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test08()  throws Throwable  {
     Appt appt0 = new Appt(25, 30, 35, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(!appt0.getValid());

}
@Test(timeout = 4000)
 public void test09()  throws Throwable  {
     Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();
     assertEquals(2, appt0.getRecurBy());
     assertFalse(appt0.isRecurring());
     assertEquals(0, appt0.getRecurIncrement());
     assertEquals("Birthday Party",appt0.getTitle());
     assertTrue(appt0.getValid());
}
@Test(timeout = 4000)
public void test10()  throws Throwable  {
   int startHour=13;
   int startMinute=30;
   int startDay=10;
   int startMonth=4;
   int startYear=2017;
   String title="Birthday Party";
   String description="This is my birthday party.";
   String emailAddress="abcd@email.com";
   //Construct a new Appointment object with the initial data
   Appt appt = new Appt(startHour,
            startMinute ,
            startDay ,
            startMonth ,
            startYear ,
            title,
           description,
           emailAddress);
// assertions
   assertTrue(appt.getValid());
   assertEquals(13, appt.getStartHour());
   assertEquals(30, appt.getStartMinute());
   assertEquals(10, appt.getStartDay());
   assertEquals(04, appt.getStartMonth());
   assertEquals(2017, appt.getStartYear());
   assertEquals("Birthday Party", appt.getTitle());
   assertEquals("This is my birthday party.", appt.getDescription());
   assertEquals("abcd@email.com", appt.getEmailAddress());
   int day=10;
   int month=04;
   int year=2017;

   assertTrue(appt.isOn(day, month, year));
   //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());

}
@Test(timeout = 4000)
public void test11()  throws Throwable  {
   int startHour=13;
   int startMinute=30;
   int startDay=10;
   int startMonth=4;
   int startYear=2017;
   String title="Birthday Party";
   String description="This is my birthday party.";
   String emailAddress="abcd@email.com";
   //Construct a new Appointment object with the initial data
   Appt appt = new Appt(
            startDay ,
            startMonth ,
            startYear ,
            title,
           description,
           emailAddress);
// assertions
   assertTrue(appt.getValid());
   // assertEquals(13, appt.getStartHour());
   // assertEquals(30, appt.getStartMinute());
   assertEquals(10, appt.getStartDay());
   assertEquals(04, appt.getStartMonth());
   assertEquals(2017, appt.getStartYear());
   assertEquals("Birthday Party", appt.getTitle());
   assertEquals("This is my birthday party.", appt.getDescription());
   assertEquals("abcd@email.com", appt.getEmailAddress());
   int day=11;
   int month=04;
   int year=2018;

   assertTrue(!appt.isOn(day, month, year));
   assertFalse(appt.hasTimeSet());
}
@Test(timeout = 4000)
public void test12()  throws Throwable  {
   int startHour=13;
   int startMinute=30;
   int startDay=10;
   int startMonth=4;
   int startYear=2017;
   String title="";
   String description="";
   String emailAddress="";
   //Construct a new Appointment object with the initial data
   Appt appt = new Appt(startHour,
            startMinute ,
            startDay ,
            startMonth ,
            startYear ,
            title,
           description,
           emailAddress);
// assertions
   assertTrue(appt.getValid());
   assertEquals(13, appt.getStartHour());
   assertEquals(30, appt.getStartMinute());
   assertEquals(10, appt.getStartDay());
   assertEquals(04, appt.getStartMonth());
   assertEquals(2017, appt.getStartYear());
   assertEquals("", appt.getTitle());
   assertEquals("", appt.getDescription());
   assertEquals("", appt.getEmailAddress());
   assertTrue(appt.hasTimeSet());

}
@Test(timeout = 4000)
 public void test13()  throws Throwable  {
     Appt appt0 = new Appt(9, -1, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
     appt0.setValid();

     // assertEquals(2, appt0.getRecurBy());
     // assertFalse(appt0.isRecurring());
     // assertEquals(0, appt0.getRecurIncrement());
     // assertEquals("Birthday Party",appt0.getTitle());
     // assertTrue(!appt0.getValid());

}
}
