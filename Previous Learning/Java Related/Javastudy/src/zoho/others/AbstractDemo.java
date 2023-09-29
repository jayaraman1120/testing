package zoho.others;
abstract class Banking{
	double principle;
	double year;
	void setData(double principle, double year) {
		this.principle = principle;
		this.year = year;
		System.out.println("Data successfully set");
	}
	abstract double simpleinterest();
	}
class Mybank extends Banking{
	double interest = 0.07;
	//if implementation is changed throws an error during compilation to implement this
	double simpleinterest() {
		double simpleinterest = 0.07 * principle * year ;		
		return simpleinterest;
	}
}
public class AbstractDemo {

	public AbstractDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybank obj_bank = new Mybank();
		obj_bank.setData(1000, 10);
		System.out.println("interest for the given principle and year " + obj_bank.simpleinterest());
	}

}
