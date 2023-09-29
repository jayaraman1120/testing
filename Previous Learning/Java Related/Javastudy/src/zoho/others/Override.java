/**
 * 
 */
package zoho.others;

/**
 * @author jaya-8047
 *
 */
class Demo {
	void print(String message) {
		System.out.println("Printing "+message);
	}
}
public class Override extends Demo {

	/**
	 * 
	 */
	public Override() {
		// TODO Auto-generated constructor stub
	}
	//Overridding 
	void print(String message) {
		System.out.println("Method is overridden in subclass");
		System.out.println("Printing "+message);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override objoverride = new Override();
		objoverride.print("to check method overridding");
		Demo obj_demo = objoverride;
		obj_demo.print("Superclass method");
	}

}
