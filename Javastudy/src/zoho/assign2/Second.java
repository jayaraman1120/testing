/**
 * 
 */
package zoho.assign2;
//In java, Primitive types and String are passed by values. Objects are passed by references.
/**
 * @author jaya-8047
 *
 */
class Book{
	String color ;
	Book(String color){
		this.color=color;
	}
	String returncolor() {
		return color;
	}
}
public class Second {

	/**
	 * @param args
	 */
	static void modify (String strarr[], int a) {
		strarr[1] = "modifiedelem";//if new object created, these will be pass by value
		a = 5;
	}
	static void swap(Book b1, Book b2) {
		Book temp = b1;
		b1 = b2;
		b2 = temp;
		System.out.println("Color of book in objects after swap inside method :b1 :"+b1.returncolor()+" b2: "+b2.returncolor());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strarr = {"elem1","elem2"};
		int a = 10;
		modify (strarr,a);
		System.out.println("elements after modified : a "+a+" string "+strarr[1]);
	Book b1 = new Book("black");
	Book b2 = new Book("Red");
	System.out.println("Color of book in objects before swap :b1 :"+b1.returncolor()+" b2: "+b2.returncolor());
	swap(b1,b2);
	System.out.println("Color of book in objects after swap :b1 :"+b1.returncolor()+" b2: "+b2.returncolor());
	}

}
