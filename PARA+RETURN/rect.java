class rect
{
	double area(int b, int h)
	{
		double area = b*h;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		rect r1 = new rect();
		double x = r1.area(9,8);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}