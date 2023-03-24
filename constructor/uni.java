class uni
{
	String course_name;
	String uni_name;
	double exam_cost;
	
	uni(String course_name, String uni_name, double exam_cost)
	{
		this.course_name=course_name;
		this.uni_name=uni_name;
		this.exam_cost=exam_cost;
	}
	public static void main(String[]args)
	{
		uni m1 = new uni("Bsc.in IT", "Makaut", 20000);
		System.out.println(m1.course_name);
		System.out.println(m1.uni_name);
		System.out.println(m1.exam_cost);
	}
	
}