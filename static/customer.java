class tcs
{
	static double req()
	{
		double ac = 1000;
		double emp_cost = 500;
		double pc = ac+emp_cost;
		return pc;
	}
}
class customer
{
	 public static void main (String[]args)
	 {
		System.out.println("***main starts***");
		double pay = tcs.req();
		
		System.out.println(pay);
		System.out.println("***main ends***");
	 }

}