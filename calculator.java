import java.util.Scanner;
class calculator
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER YOUR NUM1 : ");
		float num1 = sc.nextFloat();
		
		
		System.out.println("ENTER YOUR NUM2 : ");
		float num2 = sc.nextFloat();

		System.out.println("ENTER YOUR OPERATOR : ");
		char op = sc.next().charAt(0);

		opt = (op=='+')?num1+num2:
		(op=='-')?num1-num2:
		(op=='*')?num1*num2:
		(op=='/')?num1/num2:
		(op=='%')?num1%num2:0.000001f;

		String output= num1+" "+op+" "+num2+" = "+opt;
		
		if(!(opt==0.000001f))
			System.out.println(output);


	
	}
}