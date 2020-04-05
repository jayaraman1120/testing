package zoho.assign1;
import zoho.assign2.*;
class Third2 extends zoho.assign2.Third{
	Third2(){
		System.out.println("Inherited class printing");
		//System.out.println("Default " + n);
		//System.out.println("Private "+ n_pri);
		System.out.println("Protect "+ n_pro);
		System.out.println("Public "+ n_pub);
		//super.method();
	}
}
class Otherpackage{
	Otherpackage(){
		zoho.assign2.Third third = new zoho.assign2.Third();
		System.out.println("Otherpackage values");
		//System.out.println("Default " + third.n);
		//System.out.println("Private "+ third.n_pri);
		//System.out.println("Protect "+ third.n_pro);
		System.out.println("Public "+ third.n_pub);
	}
}
public class Thirdindiffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third2 third = new Third2();
		Otherpackage other = new Otherpackage();
				}

}
