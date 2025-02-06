import java.util.Scanner;
class Tiprate
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SUBTOTAL :");
		float total = sc.nextFloat();

		System.out.print("ENTER THE TIP RATE :");
		float tiprate = sc.nextFloat();
		
		float tip = tiprate/total;
		float final_total = tip+total;
		System.out.print("THE TIP IS :"+tip+"AND TOTAL IS : "+final_total);


		
		
		
	}
}