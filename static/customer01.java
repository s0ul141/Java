class lenskart
{
	static double specs()
	{
		double spec = 2000;
		double sunglass = 1000;
		double total = spec+ sunglass;
		return total;
	}
}
class customer01
{
	public static void main(String[]args)
	{
		System.out.println("***main stars***");
		double bill = lenskart.specs();
		double total_bill = bill - 500;
		System.out.println(total_bill);
		System.out.println("***main ends***");
	}
}