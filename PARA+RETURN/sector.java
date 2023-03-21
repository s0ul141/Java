class sector
{
	double area(int r, int t)
	{
		double area = 0.5*r*r*t;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		sector sc1 = new sector();
		double x = sc1.area(8,60);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}