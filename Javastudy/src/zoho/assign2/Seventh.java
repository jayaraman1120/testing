/**
 * 
 */
package zoho.assign2;
import java.lang.Object.*;
import java.lang.annotation.*;
/**
 * @author jaya-8047
 *
 */
public class Seventh {

	/**
	 * @param args
	 */
	//For overriding method, Access modifier and return type should be same as overriding one, check for parameter also
@Override
public	String toString() {
	return "Overriding method";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seventh seven = new Seventh ();
		String retstr = seven.toString();
		System.out.println(retstr);
	}

}
