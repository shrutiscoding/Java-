class A extends Thread
{ 	
  public void run()
  { 		
    for( int i = 1;i<=5;i++) 			
    System.out.println("Thread A : "+ i); 		
    System.out.println("Exit from Thread A"); 	
  }
} 
class B extends Thread 
{ 
  public void run() 	
  { 
   for(int i=1;i<=5;i++) 			
   System.out.println("Thread B : "+ i); 		
   System.out.println("Exit from Thread B"); 	
  }
} 
class C extends Thread
{ 
  public void run()
  { 
    for(int i=1;i<=5;i++) 		
    System.out.println("Thread C : "+ i); 		
    System.out.println("Exit from Thread C"); 	
  }
} 
public class ThreadTest 
{ 	
  public static void main(String s[]) 	
  { 	
    A ta = new A(); 		
    B tb = new B(); 	
    C tc = new C();
    ta.start(); 		
    tb.start(); 	
    tc.start(); 		 		
    System.out.println("Exit from main"); 	
  } 
}