class sample
{
	void fo()
	{
		System.out.println("FOFO");
	}
}
class demo extends sample
{
	void mo()
	{
		System.out.println("MOMO");
	}

}
class main
{
	public static void main(String[]args)
	{
		sample s1 = new demo();
		System.out.println("***upcasting***");
		s1.fo();
		demo d1 = new demo();
		System.out.println("***downcasting***");
		d1.mo();
		d1.fo();
	}
}