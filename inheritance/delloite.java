class father 
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
class delloite
{
	public static void main (String[]args)
	{
		mayank m1 = new mayank();
		m1.pocketmoney();
		m1.money();

	}
}