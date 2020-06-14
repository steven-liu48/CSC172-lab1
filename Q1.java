import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	//Check whether two strings are anagrams
	public static boolean isAnagram(String a, String b) {
		String[] a1 = a.split("");
		String[] b1 = b.split("");
		Arrays.sort(a1); 
		Arrays.sort(b1); 
		if(a1.length == b1.length) {
			for(int i = 0; i < a1.length; i++) {
				if(!a1[i].equals(b1[i])) {
					return false;
				}
			}
		}
		return true;
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
		//Result
		System.out.println(isAnagram(s1, s2));
	}
}