import java.util.Scanner;
class BMI
{
	public static void main(String[]args)
	{
		System.out.print("ENTER YOUR HEIGHT IN INCHES : ");
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();

		num = num*0.0254f;

		System.out.print("ENTER YOUR WEIGHT IN POUNDS : ");
		float num1 = sc.nextFloat();
		
		num1 = num1*0.453f;

		float bmi = num1/(num*num);
		System.out.println("YOUR BODY MASS INDEX IS :"+bmi);
		
		
	}	
}