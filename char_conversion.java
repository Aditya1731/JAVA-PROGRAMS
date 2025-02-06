class char_conversion
{
	public static void main(String[]args)
	{
		//char a = 'a';
		//short b = a;  // possible lossy conversion from char to short
		//System.out.println(b);

		char c = 'a';
		int d = c;
		System.out.println(d);

		char i = 'j';
		long k = i;
		System.out.println(k);
	
		char e = 'b';
		float f = e;
		System.out.println(f);
	
		char g = 'g';
		char h = g;
		System.out.println(h);
		

		char l = 'l';
		double m = l;
		System.out.println(m);


	}
}