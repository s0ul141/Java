class pystem
{
	static pstream outto = new pstream();
}

class pstream
{
	static void printoo(String a)
	{
		System.out.print(a);
	}
		static void printoo(int a)
	{
		System.out.print(a);
	}
		static void printoo(double a)
	{
		System.out.print(a);
	}

}

class me
{
	public static void main (String[]args)
	{
	
		pystem.outto.printoo("I am lol");
		pystem.outto.printoo(9);
		pystem.outto.printoo(9.9);

		
	}
}