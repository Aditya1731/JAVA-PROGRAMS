import java.util.Scanner;
class vowel_check
{
	public static void main(String[]args)
	{
		System.out.print("ENTER A CHARACTER");
		char a = new Scanner(System.in).next().charAt(0);
		
		
		String b = (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')?("VOWEL"):("CONSONANT");
		System.out.println(b);
		
	}
}