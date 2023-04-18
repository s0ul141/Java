class bawal
{
	public static void main(String[]args)
	{
		//even sum
		int sumofeven=0;
		int sumofprime=0;
		for (int i=280; i<290; i++)
		{	if (i%2==0)
			{
				sumofeven=sumofeven+i;
			}	
		}
		System.out.println(sumofeven);
		//prime sum
		for (int i=1; i<=sumofeven; i++)
		{	
			boolean flag=true;
			for (int j=2; j<i; j++)
			{
				
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				sumofprime=sumofprime+i;
			}
		}
		System.out.println(sumofprime);
		//check prime or not that sum of prime we got
		boolean flag2=true;
		for (int i=2; i<sumofprime; i++)
		{
				if (sumofprime%i==0)
				{
					flag2=false;
					break;
				}
		}
		if (flag2==true)
		{
			System.out.println("Yess prime "+sumofprime);
			
		}
		else
		{
			System.out.println("Nooo not prime "+sumofprime);
		}
	}

}