class mwp_ass_8
{
	static void sector(double r)
	{	
		int t = 45;
		double area= 0.5*(r*r)*t;
		System.out.println(area);
	}
	public static void main (String[]args)
	{
		System.out.println("***Main starts***");
		sector(6.96);
		System.out.println("***Main ends***");
	}
}