class mobile
{
	double cost ;
	String model_name;
	String color;
	
	mobile(double cost, String model_name, String color)
	{
		this.cost=cost;
		this.model_name=model_name;
		this.color=color;
	}
	public static void main(String[]args)
	{
		mobile m1 = new mobile(1999, "11xrm101", "Bule");
		System.out.println(m1.cost);
		System.out.println(m1.model_name);
		System.out.println(m1.color);
	}
	
}