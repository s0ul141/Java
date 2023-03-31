class linear
{
	public static void main(String[]args)
	{
		int [] arr={5,10,15,20,25};
		int find = 15;
		for (int i=0; i< arr.length; i++)
		{
			if (arr[i]==find)
			{
				System.out.println("found");
			}
		}
	}
}