package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		boolean flag = false;
		int value =0;
		for(int i = 2;i<input/2;i++) {
		    value = input%i;
			if (value==0)
			{
				
				System.out.println("this is not a Prime number ");
				flag = true;
				break;
			}
		} if(flag==false) 
			{
				System.out.println("this is a prime number ");
			}
		}
}

