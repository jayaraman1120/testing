package zoho.others;
interface Notification{
	void Checkserverstatus(String type);
	void sendmessage(String message);
	}
class Sendnotification implements Notification{
	public void Checkserverstatus(String type) {
		System.out.println("Server status is checking for this medium - "+type);
	}
	public void sendmessage (String message) {
		System.out.println("Following message will be sent "+message);	
	}
}
public class InterfaceDemo {

	public InterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification obj ;
		obj = new Sendnotification();
		obj.Checkserverstatus("SMS");
		obj.sendmessage("Object is created");
	}

}
