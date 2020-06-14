import java.util.Scanner;

public class Q2 {
	//Check if two strings are rotations
	public static boolean isRotation(String a, String b) {
		//Check length first
		if(a.length()==b.length()) {
			//Check if rotations or not
			if((a+a).contains(b)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//Two Strings for checking	
		String s1, s2;
		//Scanners
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		//User input
		System.out.print("Input the first String: ");
		s1 = scan1.nextLine();
		System.out.print("Input the second String: ");
		s2 = scan2.nextLine();
		//Output
		System.out.println(isRotation(s1, s2));
	}
}