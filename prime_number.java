import java.util.Scanner;
class prime_number
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println
		((num==2||num==3||num==5||num==7)?(num+" is a prime number"):
		((num%2==0||num%3==0||num%5==0||num%7==0)?
		(num+"is not a prime "):(num+" is a prime")));
	}
}