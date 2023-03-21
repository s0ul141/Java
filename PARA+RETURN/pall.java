class pall
{
	double area(int b, int h)
	{
		double area = b*h;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		pall p1 = new pall();
		double x = p1.area(71,8);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}