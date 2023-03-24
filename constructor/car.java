class car
{
	double cost ;
	String model_name;
	String type;
	
	car(double cost, String model_name, String type)
	{
		this.cost=cost;
		this.model_name=model_name;
		this.type=type;
	}
	public static void main(String[]args)
	{
		car m1 = new car(300000, "safari", "petrol");
		System.out.println(m1.cost);
		System.out.println(m1.model_name);
		System.out.println(m1.type);
	}
	
}