class sample
{
	int add()
	{
		int a=9, b=7;
		int c = a+b;
		return c;
	}

}
class addwithmr
{
	public static void main(String[]args)
	{
		sample s1= new sample();
		int x=s1.add();
		System.out.println(x);
	}

}