class cloth
{
	String color;
	double cost;
	String size;
	
	cloth(String color, double cost, String size)
	{
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	public static void main(String[]args)
	{
		cloth m1 = new cloth("yellow", 599, "XL");
		System.out.println(m1.color);
		System.out.println(m1.cost);
		System.out.println(m1.size);
	}
	
}