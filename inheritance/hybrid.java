class grandfather
{
	void land()
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
class uncle extends grandfather
{
	void salary()
	{
		System.out.println("1000k");
	}

}
class mayank extends father
{
	void pocket()
	{
		System.out.println("50rs");
	}
}
class hybrid
{
	public static void main(String[]args)
	{
		mayank m1 = new mayank();
		m1.pocket();
		m1.money();
		m1.land();
		uncle u1 = new uncle();
		u1.salary();
		u1.land();
	}

}