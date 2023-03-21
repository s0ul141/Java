class elli
{
	double area(int a, int b)
	{
		double area =3.14*a*b;
		return area;
	}
	
	public static void main(String[]args)
	{
		System.out.println("***Main Starts***");
		elli el1 = new elli();
		double x = el1.area(71,80);
		System.out.println(x);
		System.out.println("***Main Ends***");
	}
}