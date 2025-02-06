class Narrowing_float
{
	public static void main(String[]args)
	{
		float a = 100.0f;
		
		
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