import java.util.Scanner;
class temperature_conversion
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE DEGREE IN CELSIUS : ");
		double celsius= sc.nextDouble();
		
		double fahrenheit = (9.0/5)*celsius+32;
		System.out.print("DEGREE IN FAHRENHEIT IS : "+fahrenheit);

		
	}
}