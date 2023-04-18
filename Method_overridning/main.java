class whatsapp_v1
{
	void status()
	{
		System.out.println("For 30 sec");
	}
}

class whatsapp_v2 extends ola_v1
{
	void status()
	{
		System.out.println("For 10 sec");
	}

}

class main
{
	public static void main(String[]args)
	{
		whatsapp_v2 w1 = new whatsapp_v2();
		w1.status();
		
	}
	
}