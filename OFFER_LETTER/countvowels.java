class countvowels
{
	public static void main(String[]args)
	{
		String s1 = "softwareengineer";
		int count =0;
		for (int i=0; i< s1.length(); i++)
		{
			char x = s1.charAt(i);
			if (x=='a'|| x=='e'|| x=='i' || x=='o'|| x=='u')
			{
				count++;
			}
	
		}
		System.out.println(count);
	}

}