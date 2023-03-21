class dress
{
	static boolean shirt()
	{
		boolean s = true ;
		return s;
	}
}
class cloths
{
	public static void main(String[]args)
	{	boolean k = dress.shirt();
		if (k == true)
		{	
			System.out.println("Dressed");
		}
		System.out.println(k);
	}
}