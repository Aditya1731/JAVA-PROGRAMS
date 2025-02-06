class reverse_number
{
	public static void main(String[]args)
	{
		int num = 123;
		int duplicate = num;
		int rev = 0;

		int remaining = num %10;	// 123%10 = 3
		rev = 0*10+remaining;		// 0*10+3 = 3

		num = num/10;		//   123/10 = 12
		remaining =num%10;	//   12%10 = 2
		rev = rev*10+remaining;	// 3*10+2 = 32

		num = num/10; 		// 12/10 = 1
		remaining = num%10;	// 1/10 = 1
		rev = rev * 10 +remaining; 	// 32*10+1 = 321
		
		System.out.println(duplicate+" : "+rev);
		
		
	
	}	
}