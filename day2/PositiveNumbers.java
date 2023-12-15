package week1.day2;

public class PositiveNumbers {
	int num = 35;
	
	public void positiveorNegative() {
	if(num/2==0) {
		System.out.println("The number is positive");
	}
	else if(num/2!=0) {
		System.out.println("The number is negative");
	}
	else {
		System.out.println("The number is neutral");
	}
}

public static void main(String args[])
{
	PositiveNumbers obj = new PositiveNumbers();
	obj.positiveorNegative();
}
}
