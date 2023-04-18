class sample
{
	void mo()
	{
		System.out.println("momo");
	}
}
class demo extends sample
{
	void mo()
	{
		System.out.println("fofo");
	}
}
class casestudy
{
	public static void main(String[]args)
	{
		System.out.println("***Case study***");
		sample s1 = new demo();
		s1.mo();
	}
}