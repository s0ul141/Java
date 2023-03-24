class employee
{
	double id;
	double sal;
	char grade;
	
	employee(double id, double sal, char grade)
	{
		this.id=id;
		this.sal=sal;
		this.grade=grade;
	}
	public static void main(String[]args)
	{
		employee m1 = new employee(12313,20000,'A');
		System.out.println(m1.id);
		System.out.println(m1.sal);
		System.out.println(m1.grade);
	}
	
}