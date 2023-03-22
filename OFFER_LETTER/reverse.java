class reverse
{
	public static void main(String[]args)
	{
		String s1 = "Soumya";
		String s2 =" ";
		for (int i=5; i>=0; i--)
		{
			s2=s2+s1.charAt(i);

		}
		System.out.println(s2);
	}
}