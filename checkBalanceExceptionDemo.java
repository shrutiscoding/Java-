import java.util.*;
class Myexception extends Exception
{
	Myexception(String msg)
	{
		super(msg);
	}
}
class checkBalanceExceptionDemo
{
	public static void main(String args[])
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter your balance:");
			int balance=sc.nextInt();
			if (balance<200000)
			{
				try
				{
					throw new Myexception("Balance is less than 200000");
				}
				catch(Myexception e)
				{
					System.out.println(e);
				}
			}
			
			else
			{
				System.out.println("*******Customer Information******");
				System.out.println("Customer Name:"+name);
				System.out.println("Customer Balance:"+balance);
			}
			
		}
	
}