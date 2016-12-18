import java.util.GregorianCalendar;

public class WeekdayName
{
	public static String dayName (int weekDay) 
	{
		String result = "";

		if (weekDay == 1)
		{
			result = "Sunday";
		}
		else if (weekDay == 2)
		{
			result = "Monday";
		}
		else if (weekDay == 3)
		{
			result = "Tuesday";
		}
		else if (weekDay == 4)
		{
			result = "Wednesday";
		}
		else if (weekDay == 5)
		{
			result = "Thursday";
		}
		else if (weekDay == 6)
		{
			result = "Friday";
		}
		else if (weekDay == 7)
		{
			result = "Saturday";
		}
		else if (weekDay == 0)
		{
			result = "Saturday";
		}
		else
		{
			result = "error";
		}

		return result;
	}


	public static void main(String[] args)
	{
		System.out.println("Weekday 1: " + dayName(1));
		System.out.println("Weekday 2: " + dayName(2));
		System.out.println("Weekday 3: " + dayName(3));
		System.out.println("Weekday 4: " + dayName(4));
		System.out.println("Weekday 5: " + dayName(5));
		System.out.println("Weekday 6: " + dayName(6));
		System.out.println("Weekday 7: " + dayName(7));
		System.out.println("Weekday 0: " + dayName(0));
		System.out.println();
		System.out.println("Weekday 43: " + dayName(43));
		System.out.println("Weekday 17: " + dayName(17));
		System.out.println("Weekday -1: " + dayName(-1));

		GregorianCalendar cal = new GregorianCalendar();
		int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

		System.out.println("\nToday is a " + dayName(dow) + "!");
	}
}
