class Narrowing_double
{
	public static void main(String[]args)
	{
		double a = 100.0;
		float b = (float) a;
		System.out.println(b);
		
		long c = (long) a;
		System.out.println(c);

		int d = (int) a;
		System.out.println(d);

		char g = (char) a;
		System.out.println(g);



		short e = (short) a;
		System.out.println(e);

		byte f = (byte) a;
		System.out.println(f);
	}
}