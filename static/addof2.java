class main 
{
	static void add_2(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
}
class addof2
{
	public static void main (String[]args)
	{
		System.out.println("###main starts###");
		main.add_2(10,4);
		System.out.println("###main ends###");
	}
}