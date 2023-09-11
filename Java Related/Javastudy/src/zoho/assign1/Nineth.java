package zoho.assign1;

import java.util.Scanner;

public class Nineth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char to find its category");
		char c = scan.next().charAt(0);
		int Char = (int) c;
		System.out.print("Entered char "+ c +" is ");
		if (Char <= 122 && Char >= 97) {
			System.out.print("Lower case ");
		} else if (Char <= 90 && Char >= 65) {
			System.out.print("Upper case ");
		}else if (Char <= 57 && Char >= 48) {
			System.out.print("Numeric character ");
		}else {
			System.out.print("Special character ");
		}
		scan.close();
	}
}
