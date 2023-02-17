class mwr_1
{
	static double hr()
	{
		double bp = 30000.00;
		double fa = 10000.00;
		double ma = 10000.00;
		double ta = 10000.00;
		double sal = bp+fa+ma+ta;
		return sal;
	}

	public static void main(String[]args)
	{
		System.out.println("***main starts***");
		double x= hr();
		double hike = x+12000.00;
		System.out.println(hike);
		System.out.println("***main end***");
	}
}