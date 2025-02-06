import java.util.Scanner;
class sum_off_digits
{
	public static void main(String[]args)
	{
		System.out.print("ENTER THE NUMBER : ");
		int num = new Scanner(System.in).nextInt();
		
		int add = 0;
		
		int a = num%10;
		num = num/10;	
		int b = num%10;
		num = num/10;
		int c = num%10;
		System.out.print("THE SUM OF THE DIGITS "+(a+b+c));
		
	}
}