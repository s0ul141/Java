class cab
{
	void ride()
	{
		System.out.println("LEts gooooooo");
	}
}
class ola
{
	public static void main(String[]args)
	{
		cab c1 = new cab();
		customer.home(c1);
	}
}
class customer
{
	static void home(cab c2)
	{
		c2.ride();
	}
}