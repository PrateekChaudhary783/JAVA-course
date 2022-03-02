import java.util.*;
public class Fibonacci {
	static int fibo(int n)
    {
	if (n <= 1)
		return n;
	return fibo(n-1) + fibo(n-2);
    }
      
    public static void main (String args[])
    {
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter the number :");
		int n = obj.nextInt();
    System.out.println(fibo(n));
    }

}
