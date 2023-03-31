class linear
{
	public static void main(String[]args)
	{
		int [] arr={5,10,15,20,25};
		int find = 15;
		int c=0;
		for (int i=0; i< arr.length; i++)
		{
			if (arr[i]==find)
			{	c=1;
				System.out.println("found");
			}
			
		}
		if (c==0)
		{
			System.out.println("not found");
		}
		
	}

}