package zoho.others;
class Device{
	String devicename;
	String deviceip;
	void createBasedetail(String devicename,String deviceip) {
		this.devicename = devicename;
		this.deviceip = deviceip;
		System.out.println("Device Name is "+devicename+"\nDevice IP Address is "+deviceip + "It is set");
	}
}
class Computer extends Device {
	String OS;
	String manufacturer;
	String architecture;
	void additionaldetail(String OS, String manufacturer, String architecture) {
		this.OS = OS;
		this.manufacturer = manufacturer;
		this.architecture = architecture;
		System.out.println("Values are assigned to variables OS,manufacturer,architecture");
	}
	
}
//Since basic details and methods are mentioned in superclass, it can be extended in any classes
public class InheritanceDemo {

	public InheritanceDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Computer computer_obj = new Computer();
		computer_obj.createBasedetail("jaya-8047", "172.72.13.89");
		computer_obj.additionaldetail("Windows 10", "DELL", "x32");
	}
}
