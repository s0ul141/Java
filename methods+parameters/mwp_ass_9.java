class mwp_ass_9
{
	static void bill(double x)
	{
		int unit = 20;
		double bill = unit*x;
		System.out.println(bill);
	}
	public static void main (String[]args)
	{
		System.out.println("***main starts***");
		bill(15.5);
		System.out.println("***Main ends***");
	}
}