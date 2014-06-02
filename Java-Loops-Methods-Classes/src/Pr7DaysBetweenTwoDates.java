
import java.util.Scanner;


import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Pr7DaysBetweenTwoDates {


	public static void main(String[] args) {

	    System.out.print("Insert first date : ");
	    Scanner s = new Scanner(System.in);
	    String firstdate = s.nextLine();
	    System.out.print("Insert second date : ");
	    String seconddate = s.nextLine();

	    // Formatter
	    DateTimeFormatter dateStringFormat = DateTimeFormat.forPattern("dd-MM-yyyy");
	    DateTime firstTime = dateStringFormat.parseDateTime(firstdate);
	    DateTime secondTime = dateStringFormat.parseDateTime(seconddate);
	    Days day = Days.daysBetween(firstTime, secondTime);
	    int days = day.getDays();
	    System.out.println("Days between the two dates " + days);
	   }
  }
