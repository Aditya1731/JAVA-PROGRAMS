import java.util.Scanner;
class area_of_circle
{
	public static void main(String[]args)
{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE radius:");
		float rad = sc.nextFloat();
		final float pi = 22/7;
		float c = pi*(rad*rad);
		float perimeter = 2*pi*rad;
		System.out.println("AREA OF THE CIRCLE FOR THE RADIUS "+rad+" IS "+c+"AND PARAMETER IS "+perimeter);
		
}
}