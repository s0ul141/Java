class old
{
	void ram()
	{
		System.out.println("4gb");
	}

}
class neww extends old
{
	void ram()
	{
		System.out.println("8gb");
	}
}
class lap
{
	public static void main (String[]args)
	{
		neww n1 = new neww();
		n1.ram();
	}

}