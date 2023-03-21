class circle
{
	double area(int r)
	{
		double area = 3.14*r*r;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		circle c1 = new circle();
		double x = c1.area(88);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}