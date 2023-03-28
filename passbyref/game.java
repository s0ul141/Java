class op 
{
	void won()
	{
		System.out.println("U won");
	}
	void lost()
	{
		System.out.println("U lost");
	}
}
class game
{
	public static void main(String[]args)
	{
		op o1 = new op();
		user1.res(o1);
		user2.res(o1);
	}
}
class user1
{
	static void res(op o2)
	{
		o2.won();
	}
}
class user2
{
	static void res(op o3)
	{
		o3.lost();
	}
}