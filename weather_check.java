import java.util.Scanner;
class weather_check
{
	public static void main(String[]args)
	{
		System.out.print("ENTER MONTH : ");
		String a = new Scanner(System.in).next();

		String b = (a.equals(oct)||a.equals(nov)||a.equals(dec))?("WINTER"):((a.equals(mar)||a.equals(feb)||a.equals(apr)||a.equals(may))?("SUMMER"):((a.equals(jun)||a.equals(jul)||a.equals(aug)||a.equals(sep))?("MONSOON"):("invalid month")));
		

		System.out.println(b);
		
		
	
		
	}
}