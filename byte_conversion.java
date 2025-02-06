class byte_conversion
{
	public static void main(String[]args)
	{
		byte a = 100;
		short b = a;
		System.out.println(b);

		byte c = 100;
		int d = c;
		System.out.println(d);
	
		byte e = 100;
		long f = e;
		System.out.println(f);
	
		//byte g = 100;
		//char h = g;  // lossy conversion from byte to char
		//System.out.print(h);
		
		byte j = 100;
		float k = j;
		System.out.println(k);

		byte l = 100;
		double m = l;
		System.out.println(m);

	}

}