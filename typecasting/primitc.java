class primitc
{
	public static void main(String[]args)
	{
		System.out.println("***widening***");
		double x = 20;//implicitly
		System.out.println(x);
		double y = 20.67f;//explicitly
		System.out.println("***Narrowing***");
		int a = (int)20.65d;//implicitly
		System.out.println(a);
		float b =(float)66.75d;//explicitly
		System.out.println(b);	
	}
}