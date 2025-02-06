import java.util.Scanner;
class ASCII_string_check
{
	public static void main(String[]args)
	{
		System.out.print("ENTER A CHARACTER");
		char ch = new Scanner(System.in).next().charAt(0);
		
		
		String b = ((ch>=65 && ch<=90)||(ch>='a' && ch<='z'))?((ch>='a' && ch<='z')?(ch+"LOWERCASE"):(ch+"UPPERCASE")):((ch>='0' && ch<='9')?(ch+"IS A DIGIT"):(ch+"IS A SPECIAL CHARACTER"));
		System.out.println(b);
		
	}
}