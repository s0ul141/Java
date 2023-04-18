class senrev
{
	public static void main(String[]args)
	{
		String a = "Hi i am a developer";
		String b=" ";
		for (int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);

	}
}