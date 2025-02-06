class loop_even_odd
{
	public static void main(String[]args)
	{
		for(int i =1 ; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"   ");
			}
		}
		break;
		
		System.out.println();
		System.out.println();
		System.out.println();



		for(int i =100 ; i<=1; i--)
		{
			if(i%2!=0)
			{
				System.out.print(i+"   ");
			}
		}

	}
}