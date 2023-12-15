package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34343;
		int temp = 0;
		int originalNum = num;
		 for (int i=0;i<String.valueOf(num).length();i++) {
	           int remainder = originalNum % 10;
	           temp = temp * 10 + remainder;
	           originalNum /= 10;
	        }
		 if(num == temp) {
		 System.out.println("The number is Palindrome");
		
	}
		 else {
			 System.out.println("The number is not Palindrome");
		 }

}
}

