class school
{	
	String name;
	int grade;
	double strength;
	
	school(String name, int grade, double strength)
	{
		this.name=name;
		this.grade=grade;
		this.strength=strength;
	}
	public static void main(String[]args)
	{
		school s1 = new school("TCMS", 12, 50000 );
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.strength);
	}
	
}