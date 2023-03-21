class mwp_ass_2
{
	static double bill ()
	{   
        double x = 12.32;
		int unit = 20;
		double bill = unit*x;
		return bill;
	}
	public static void main (String[]args)
	{
		System.out.println("***main starts***");
		double y = bill();
        System.out.println(y);
		System.out.println("***Main ends***");
	}
}