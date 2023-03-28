class bitcoin  
{
	void price()
	{
		System.out.println("Falling!!!!!!!!!");
	}

}
class binance
{
	public static void main(String[]args)
	{
		bitcoin btc = new bitcoin();
		trader.view(btc);

	}

}
class trader
{
	static void view(bitcoin btc1)
	{
		btc1.price();
	}
}