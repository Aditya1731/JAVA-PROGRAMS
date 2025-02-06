class int_conversion
{
	public static void main(String[]args)
	{
		int a = 100;
		int b = a;
		System.out.println(b);

		int c = 100;
		long d = c;
		System.out.println(d);
	
		int e = 100;
		float f = e;
		System.out.println(f);
	
		//int g = 100;
		/char h = g;  // possible lossy conversion from int to char
		//System.out.print(h);
		

		int l = 100;
		double m = l;
		System.out.println(m);


	}
}