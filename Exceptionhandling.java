class Exceptionhandling
{
	public static void main (String args[])
	{
		try
		{
			int a=60;
			int b=0 ;
			int c = a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Exception Arises");
			System.out.println(e);
		}
	}
}