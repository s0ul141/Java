class m_ass_3
{
	static void trap()
	{
		int a=20, b=20 , height = 39;
		double area = 0.5*((a+b)*height);
		System.out.println(area);
	}
	public static void main (String[]args)
	{
		System.out.println("***main starts***");
		trap();
		System.out.println("***main ends***");
	}

}