class grandfather
{
	void land ()
	{
		System.out.println("Big land");
	}
}

class father extends grandfather
{
	void money()
	{
		System.out.println("5crore");
	}
}
class mayank extends father
{
	void pocketmoney()
	{
		System.out.println("50 rs only");
	}
}
class girlfrand
{
	public static void main (String[]args)
	{
		mayank m1 = new mayank();
		m1.pocketmoney();
		m1.money();
		m1.land();


	}
}