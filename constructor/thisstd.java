class thisstd
{	int std_id;
	String std_name;
	int std_roll;
	thisstd(int std_id, String std_name )
	{
		this.std_id=std_id;
		this.std_name=std_name;
		this.std_roll=std_id;
	}

	public static void main(String[]args)
	{
		thisstd s1 = new thisstd(1,"soumya");
		System.out.println(s1.std_id);
		System.out.println(s1.std_name);
		System.out.println(s1.std_roll);
	}
}