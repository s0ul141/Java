class ola_v1
{
	void ride()
	{
		System.out.println("ride with cab");
	}
}

class ola_v2 extends ola_v1
{
	void ride()
	{
		super.ride();
		System.out.println("ride with bike");
	}

}

class mainola
{
	public static void main(String[]args)
	{
		ola_v2 w1 = new ola_v2();
		w1.ride();
		
	}
	
}