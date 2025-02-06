import java.util.Scanner;
class ASCII
{
	public static void main(String[]args)
	{
		char ch = new Scanner(System.in).next().charAt(0);
		
		
		String b = (ch>=65 && ch<=90)?(" an upper case"):("it is not an upper case");
		System.out.println(b);
		
	}
}