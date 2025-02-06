class Narrowing_long
{
	public static void main(String[]args)
	{
		long a = 100;

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