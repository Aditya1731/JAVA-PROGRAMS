import java.util.Scanner;
class pattern10{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		long num = new Scanner(System.in).nextLong();

		int base=1;
		long decimal=0;
		for (long i =num; i>0;i/=10 ) {
			long last = i%10;
			decimal=(last*base)+decimal;
			base*=2;
			
		}
		System.out.println(decimal);
	}
}