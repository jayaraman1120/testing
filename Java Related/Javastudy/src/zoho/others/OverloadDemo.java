/**
 * 
 */
package zoho.others;

/**
 * @author jaya-8047
 *
 */
//Usercreation can be used as example like Local User with password, Ad user without password
public class OverloadDemo {
	void area () {
		System.out.println("Input values are undefined. Unable to process");
	}
	void area (double radius) {
		System.out.println("Area of circular "+ 3.14 * radius * radius);
	}
	void area (int radius1) {
		System.out.println("Area of circular "+ 3.14 * radius1);
	}
	void area (double length, double breath) {
		System.out.println("Area of rectangle "+ length * breath);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		obj.area();
		double i = 10;
		obj.area(i);
		obj.area(10,10);
	}

}
