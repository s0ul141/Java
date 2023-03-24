class bike
{
	double cost ;
	String brand;
	String color;
	
	bike(double cost, String brand, String color)
	{
		this.cost=cost;
		this.brand=brand;
		this.color=color;
	}
	public static void main(String[]args)
	{
		bike m1 = new bike(1999, "Royal_Enfield", "Bule");
		System.out.println(m1.cost);
		System.out.println(m1.brand);
		System.out.println(m1.color);
	}
	
}