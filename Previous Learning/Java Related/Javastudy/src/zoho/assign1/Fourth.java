package zoho.assign1;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be printed");
		int n = scan.nextInt();
		int a = 0, b = 1;
		System.out.print("Fibonacci series " + a +" "+ b);
		for (int i = 0; i < n-2; i++) {
		int c = a + b;
		System.out.print(" " + c);
		a = b;
		b = c;
		}
		scan.close();
	}
}
