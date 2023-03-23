class emp
{	int emp_id;
	String emp_name;
	double emp_sal;
	emp(int x, String y, double z)
	{
		emp_id=x;
		emp_name=y;
		emp_sal=z;
	}

	public static void main(String[]args)
	{
		emp s1 = new emp(1,"soumya",10000);
		System.out.println(s1.emp_id);
		System.out.println(s1.emp_name);
		System.out.println(s1.emp_sal);
	}
}