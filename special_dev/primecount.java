class primecount
{
	public static void main(String[]args)
	{
		int count=0;
		for (int i=1;i<=100 ;i++)
		{
			boolean flag=true;
			for (int j=2; j<i; j++)
			{	
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}