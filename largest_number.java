import java.util.Scanner;
class largest_number
{
	public static void main(String[]args)
	{
		System.out.print("ENTER A 4 DIGIT NUMBER : ");
		int num = new Scanner(System.in).nextInt();
		
		int a = num%10;	//3
		num = num/10;
		
		int b = num%10;	//2
		num = num/10;

		int c = num%10;	//1
		num = num/10;

		int d = num%10;	//1
		num = num/10;

		int largest = (a>b)?((a>c)?((a>d)?(a):(d)):((c>d)?(c):(d))):(b>c)?((b>d)?(b):(d)):((c>d)?(c):(d));
		System.out.println("Largest number is :"+largest);

		
		
		
		
		
	}
}