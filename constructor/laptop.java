class laptop
{
	String name;
	double cost;
	String brand;
	
	laptop(String name, double cost, String brand )
	{
		this.name=name;
		this.cost=cost;
		this.brand=brand;
	}
	public static void main(String[]args)
	{
		laptop m1 = new laptop("G3", 69000, "Dell");
		System.out.println(m1.name);
		System.out.println(m1.cost);
		System.out.println(m1.brand);
	}
	
}