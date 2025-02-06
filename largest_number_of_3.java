import java.util.Scanner;
class largest_number_of_3
{
	public static void main(String[]args)
	{
		System.out.print("ENTER A 3 DIGIT NUMBER : ");
		int num = new Scanner(System.in).nextInt();
		
		int a = num%10;	//3
		num = num/10;
		
		int b = num%10;	//2
		num = num/10;

		int c = num%10;	//1
		num = num/10;

		int largest = (a>b)?((a>c)?(a):(c)          ) : ((b>c)?(b):(c)           );
		System.out.print(largest);
	}
}