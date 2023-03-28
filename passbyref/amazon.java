class items
{
	void shoes()
	{
		System.out.println("Sorry out of stock");
	}
}
class amazon 
{
	public static void main(String[]args)
	{
		items i1 = new items();
		me.wish(i1);
	}
}
class me
{
	static void wish(items i2)
	{
		i2.shoes();
	}
}
