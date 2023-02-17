class mwr_ass_1
{
	static double triangle()
	{
		int base = 70, height = 30;
		double area = 0.5*(base*height);
		return area;
	}
	public static void main (String[]args)
	{
		System.out.println("***main starts***");
		double x = triangle();
		System.out.println(x);
		System.out.println("***main ends***");
	}

}