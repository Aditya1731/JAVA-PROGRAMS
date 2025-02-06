import java.util.Scanner;
class voulume_of_cylinder
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE RADIUS : ");
		float radius = sc.nextFloat();
		
		System.out.print("ENTER THE HEIGHT : ");
		float height = sc.nextFloat();


		
		float area = (22f/7f)*radius*radius;
		float volume = area*height;
		System.out.println("AREA IS : "+area);
		System.out.print("VOLUME IS : "+volume);

		

	}
}