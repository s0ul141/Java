class count 
{
	public static void main(String[]args)
	{
		String s1 = "java";
		int count =0;
		for (int i=0; i< s1.length(); i++)
		{
			char x = s1.charAt(i);
			if (x=='a')
			{
				count++;
			}
	
		}
		System.out.println(count);
	}

}