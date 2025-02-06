import java.util.Scanner;
class loop_name
{
	public static void main(String[]args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name :");
		String name = sc.next().toUpperCase();

		

		for (int i =0;i<=name.length()-1;i++)
		{
			System.out.println(name.charAt(i)+":"+i);
			Thread.sleep(1000);

		}

	}
}