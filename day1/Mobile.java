package week1.day1;

public class Mobile {
public void makeCall(String mobileModel,float mobileWeight) {
	System.out.println("Calling");
}
public void sendMsg(boolean isFullcharged,int mobileCost)
{
	System.out.println("My Mobile");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my mobile");
		Mobile obj = new Mobile();
		obj.makeCall("Iphone", 20.0f);
		obj.sendMsg(true,60000);
	}

}
