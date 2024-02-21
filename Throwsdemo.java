class Throwsdemo
{
	 int num;
	 void mymethod (int num) throws ArithmeticException, NullPointerException
	 { 
	 if(num==1)
	 {
	 throw new ArithmeticException ("Arithmetic Exception occurred");
	 }
	 else
	 { 
	 throw new NullPointerException ("NullpointerException occured");
	 }
	 }
	  public static void main (String args[])
	  { 
	  try
	  {
	  Throwsdemo obj = new Throwsdemo(); 
	  obj. mymethod (2);
	  } 
	  catch (Exception e)
	  {
	  	System.out.println (e);
	  }
	  }
}