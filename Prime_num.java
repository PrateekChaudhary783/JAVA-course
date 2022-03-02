import java.util.*;
public class Prime_num {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Please insert any number :");
		    int num = obj.nextInt();
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}


