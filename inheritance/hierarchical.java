class mayank
{
	void property()
	{
		System.out.println("5crore+50rs");
	}

}
class son1 extends mayank
{
	void money()
	{
		System.out.println("10rs daily");
	}

}
class son2 extends mayank
{
	void money()
	{
		System.out.println("300 rs monthly");
	}


}

class hierarchical
{
	public static void main (String[]args)
	{
		son1 s1 = new son1();
		s1.money();
		s1.property();
		son2 s2 = new son2();
		s2.money();
		s2.property();

	}
	
}