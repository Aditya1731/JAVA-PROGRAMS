class short_conversion
{
	public static void main(String[]args)
	{
		short a = 100;
		int b = a;
		System.out.println(b);

		short c = 100;
		long d = c;
		System.out.println(d);
	
		short e = 100;
		float f = e;
		System.out.println(f);
	
		//short g = 100;
		//char h = g;  // possible lossy conversion from short to char
		//System.out.print(h);
		

		short l = 100;
		double m = l;
		System.out.println(m);


	}
}