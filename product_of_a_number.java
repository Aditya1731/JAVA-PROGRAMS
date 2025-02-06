import java.util.Scanner;
class product_of_a_number
{
	public static void main(String[]args)
	{	
		int num=new Scanner(System.in).nextInt();
		int rem = 1;

		int a = num%10;
		rem = rem * a;

		num = num/10;
		a = num%10;
		rem = rem * a;

		num = num/10;
		a = num%10;
		rem = rem * a;

		System.out.println(rem);
	}
}