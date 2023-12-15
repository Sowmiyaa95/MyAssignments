package week1.day2;

public class NegativetoPositive {
	
	static int number = 90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(number<0) {
			number = Math.abs(number);
			System.out.println("The number is converted to positive = "+number);
		}
		else {
			System.out.println("The given number is already 0 or positive");
		}
	}

}
