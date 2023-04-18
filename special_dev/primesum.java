class primesum
{
	public static void main(String[]args)
	{
		int sum=0;
		int no=9;
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
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}