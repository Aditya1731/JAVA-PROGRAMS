import java.util.Scanner;
class minutes_to_years
{
	public static void main(String[]args)
	{
		long min = new Scanner(System.in).nextLong();
		long hour = min/60;
		long day = hour/24;
		long year = day/365;
		long leftDays= day%365;
		
		System.out.println(year+" YEARS "+leftDays+" left days");
	}
}