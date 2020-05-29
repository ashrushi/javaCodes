package javaCodes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String reverse");
		
		String string=sc.nextLine();
		String rev="";
		int length=string.length();
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+string.charAt(i);
			
			
			
		}
		
		
		
		System.out.println("Reversed String is:"+rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
