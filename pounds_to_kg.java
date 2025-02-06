import java.util.Scanner;
class pounds_to_kg
{
	public static void main(String[]args)
	{
		int pounds = new Scanner(System.in).nextInt();
		double kg = pounds*0.454;
		System.out.println("POUNDS TO KG ARE : "+kg);
	}
}