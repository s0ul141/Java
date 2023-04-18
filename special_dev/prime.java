class prime
{
	public static void main(String[]args)
	{
		int no=9;
		boolean flag=true;
		for (int i=2; i<no; i++)
		{	
				if (no%i==0)
				{
					flag=false;
					break;
				}
		}
		if (flag==true)
		{
			System.out.println("Yess prime "+no);
		}
		else
		{
			System.out.println("Nooo not prime "+no);
		}

	}
}