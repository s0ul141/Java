class Main8
{

	public static void main (String[]args)
	{
		System.out.println("***Main Starts***");

		circle c1=new circle();
		double a = c1.area(8);
		System.out.println("circle "+a);

		elli el1 = new elli();
		double b = el1.area(71,80);
		System.out.println("ellipse "+b);

		pall p1 = new pall();
		double c = p1.area(71,8);
		System.out.println("pallindrome "+c);

		rect r1 = new rect();
		double d = r1.area(9,8);
		System.out.println("rectangle "+d);

		sector sc1 = new sector();
		double e = sc1.area(8,60);
		System.out.println("sector "+e);
		
		square s1 = new square();
		double f = s1.area(36);
		System.out.println("square "+f);
	
		trap tp1 = new trap();
		double g = tp1.area(71,80,81);
		System.out.println("Trapizium "+g);

		triangle t1 = new triangle();
		double h = t1.area(3,8);
		System.out.println("triangle "+h);

		System.out.println("***Main Starts***");
	}
}
