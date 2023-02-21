class main
{
	static void mul_3(int a, int b, int c)
	{
		int d = a*b*c;
		System.out.println(c);
	}
}
class mulof3
{
	public static void main (String[]args)
	{
		System.out.println("###Main starts###");
		main.mul_3(3,6,9);
		System.out.println("###main ends###");
	}
}