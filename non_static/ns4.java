class ns4
{
	void add3(int a, int b, int d)
	{
		//int a=10, b=23;
		int c=a+b+d;
		System.out.println(c);
	}
	public static void main (String[]args)
	{
		System.out.println("***Main Starts***");
		new ns4().add3(29,99,70);
		System.out.println("***main ends***");
	
	}

}