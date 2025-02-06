import java.util.Scanner;
class marks_to_percentage_check
{
	public static void main(String[]args)
	{
		System.out.print("ENTER MARKS");
		float a = new Scanner(System.in).nextInt();
		
		float c = 100f*(a/600f);
		

		String b = (c<=100 && c>=75)?("GRADE A"):((c<75 && c>=60)?("GRADE B"):((c<60 && c>=35)?("GRADE C"):("FAIL")));
		System.out.println(b);
		System.out.println(c);
		
	
		
	}
}