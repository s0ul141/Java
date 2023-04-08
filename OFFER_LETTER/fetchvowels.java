class fetchvowels
{
	public static void main(String[]args)
	{
		String s1 = "softwareengineer";
		String s2 = "";
		for (int i=0; i< s1.length(); i++)
		{
			char x = s1.charAt(i);
			if (x=='a'|| x=='e'|| x=='i' || x=='o'|| x=='u')
			{
				s2=s2+s1.charAt(i);
			}
	
		}
		System.out.println(s2);
	}

}