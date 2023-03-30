class whatsapp
{
	static void send (int x)
	{
		System.out.println("HI");
	}
	static void send (String y)
	{
		System.out.println("HELLO");
	}
	static void send (int x, String y)
	{
		System.out.println("HEY");
	}
	static void send (String y,int x)
	{
		System.out.println("BEY");
	}
	public static void main (String[]args)
	{
		
		send(1);
		send("hi");
		send(1,"hi");
		send("hi",1);
	}
}