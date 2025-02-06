class swap
{
	public static void main(String[]args)
{
		int a=10;
		int b=5;
		System.out.println("BEFORE SWAPPING");
		System.out.println("A :"+a);
		System.out.println("b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING");
		System.out.println("A :"+a);
		System.out.println("b :"+b);
}
}