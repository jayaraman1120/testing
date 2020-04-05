/**
 * 
 */
package zoho.assign3;

import java.util.Calendar;
import java.util.Date;

/**
 * @author jaya-8047
 *
 */
public class Nineth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.print("Current Date and Time " );
		System.out.print(calendar.get(Calendar.DATE)+"-");
		System.out.print(months[calendar.get(Calendar.MONTH)]+"-");
		System.out.print(calendar.get(Calendar.YEAR)+" ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.print(calendar.get(Calendar.SECOND));
		/*In date we can not get individual component as calendar
		Date date = new Date();
		System.out.println(date);*/
	}

}
