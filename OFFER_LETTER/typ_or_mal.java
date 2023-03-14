class typ_or_mal
{
    static void what_to_do( double bc, double temp)
    {
        if(temp >= 102 && bc<=7000 )
        {
            System.out.println("Malaria");
        }
        else if(temp >=102 && bc<=6000)
        {
            System.out.println("Typiod");
        }
    }





    public static void main(String[]args)
    {
        System.out.println("***Main Starts***");
        what_to_do(108,6900);
        System.out.println("***Main Ends***");
    }
}