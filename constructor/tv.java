class tv
{
	double cost ;
	String brand;
	String type;
	
	tv(double cost, String brand, String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public static void main(String[]args)
	{
		tv t1 = new tv(79999, "Sony", "smart");
		System.out.println(t1.cost);
		System.out.println(t1.brand);
		System.out.println(t1.type);
	}
	
}