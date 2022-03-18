import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string :");
		String a = obj.next();
		String r = reverse(a);
		System.out.println(r);

	}
	//creating a reverse method
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		
		int letterIndex = 0;
		for (int i = s.length() - 1; i>= 0; i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			reverse=reverse + letters[i];
		}
		return reverse;
		
	}

}
