import java.util.Scanner;
class digits_sum{

	public static void main(String[]args){
		System.out.println("Enter a number : ");
		
		int num = new Scanner(System.in).nextInt();

		int duplicate = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			sum +=rem;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(duplicate);

		
	}
}


