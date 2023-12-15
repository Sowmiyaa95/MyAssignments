package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstnum = 0;
		int secnum = 1;
		int temp;
		System.out.println(+firstnum);
		System.out.println(+secnum);
		for(int i=1;i<=range;i++) {
			temp = firstnum + secnum;
			firstnum = secnum;
			secnum = temp;
			System.out.println(+temp);
	}

}
}
