/**
 * 
 */
package zoho.assign2;

/**
 * @author jaya-8047
 *
 */
//this will be for access modifiers
class Derived extends Third{
	Derived(){
		System.out.println("sub class");
		System.out.println("Default " + n);
		//System.out.println("Private "+ n_pri);
		System.out.println("Protect "+ n_pro);
		System.out.println("Public "+ n_pub);
		super.method();
	}
	
}

public class Third {

	/**
	 * @param args
	 */
	int n =1;
	private int n_pri = 1;
	protected int n_pro = 1;
	public int n_pub =1;
	public Third(){
		System.out.println("Public class");
		System.out.println("Default " + n);
		System.out.println("Private "+ n_pri);
		System.out.println("Protect "+ n_pro);
		System.out.println("Public "+ n_pub);
	}
	void method() {
		System.out.println("Method calling");
	}
}

class Samepackage{
	Samepackage(){
	Third third = new Third();
	System.out.println("same class in same package");
	System.out.println("Default " + third.n);
	//System.out.println("Private "+ third.n_pri);
	System.out.println("Protect "+ third.n_pro);
	System.out.println("Public "+ third.n_pub);
	third.method();
	}
}