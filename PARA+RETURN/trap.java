class trap
{
	double area(int a, int b, int h)
	{
		double area =0.5*(a+b)*h;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		trap tp1 = new trap();
		double x = tp1.area(71,80,81);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}