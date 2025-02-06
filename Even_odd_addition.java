class Even_odd_addition
{
	public static void main(String[]args)
	{
		int num = 7265;
		int eve = 0;
		int odd = 0;
		int temp = 0;
		int rem = num%10;	//5
		temp = (rem%2==0)?(eve=eve+rem):(odd=odd+rem);
		


		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(eve=eve+rem):(odd=odd+rem);


		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(eve=eve+rem):(odd=odd+rem);

		

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(eve=eve+rem):(odd=odd+rem);

		System.out.println("Even sum : "+eve);
		System.out.println("odd sum : "+odd);
		
		
		
		
	}
}