import java.util.Scanner;
class loop_name_vowel
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name :");
		String name = sc.next().toUpperCase();

		

		for (int i =0;i<name.length();i++)
		{
			char vowel = name.charAt(i);
			
			if(vowel=='A'||vowel=='E'||vowel=='I'||vowel=='O'||vowel=='U')
			{
				System.out.println(vowel+" "+i+" ");

			}

		}

	}
}