class ns5
{
	void mul3(int a, int b, int d)
	{
		//int a=10, b=23;
		int c=a*b*d;
		System.out.println(c);
	}
	public static void main (String[]args)
	{
		System.out.println("***Main Starts***");
		new ns5().mul3(29,9,7);
		System.out.println("***main ends***");
	
	}

}