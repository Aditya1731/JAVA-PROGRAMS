import java.util.Scanner;
class Character_index
{
	public static void main(String[]args)
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		char ch = sc.next().charAt(0);
		System.out.print(ch);

		System.out.print("Enter a character:");
		char ch1 = sc.next().charAt(3);
		System.out.print(ch);
		
		System.out.print("Enter a character:");
		char ch2 = sc.next().charAt(5);
		System.out.print(ch);



}
}