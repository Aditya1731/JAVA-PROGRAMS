import java.util.Scanner;
class digit_check
{
	public static void main(String[]args)
	{
		System.out.print("ENTER A NUMBER : ");
		int a = new Scanner(System.in).nextInt();
		
		
		String b =(a%2==0)?((a%5==0)?("HiTwoHiFive"):("HiTwo")):((a%5==0)?((a%2==0)?("HiTwoHiFive"):("HiFive")):(" "));
		System.out.println(b);
		
	}
}