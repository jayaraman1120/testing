package hackerrank;

import java.util.Scanner;

public class Thirdday {
	 private static final Scanner scanner = new Scanner(System.in);
	 static void checkeven(int n) {
		 if ((n%2) == 0) {
			 if((n>1)&&(n<=5)) {
				 System.out.println("Not Weird"); 
			 }else if ((n>5)&&(n<=20)) {
				 System.out.println("Weird"); 
			 }else {
				 System.out.println("Not Weird"); 
			 }
		 }else {
			 System.out.println("Weird");
		 }
	 }
	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if ((N>0)&&(N<=100)) {
	        	checkeven(N);
	        }else {
	        	System.out.println("Enter proper value");
	        }
	        scanner.close();
	    }
}
