import java.util.*;
class factorial
	{
	static void fact(int x)
		{
			int p=1;
			for(int i=1;i<=x;i++)
				{
				p=p*i;
				}
			System.out.println(p);

		}
       public static void main(String args[])
		   {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			//int s = 0;
			fact(n);
		  
			}
    }