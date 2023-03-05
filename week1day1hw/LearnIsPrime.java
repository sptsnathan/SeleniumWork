package week1day1hw;

public class LearnIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j=0, k=0, m;
		int p=29;//number to be checked for prime or not
		switch (m=p/2) {
			case 0: System.out.println(p+" is not a prime number");break;
			case 1: System.out.println(p+" is not a prime number"); break;
			}
		for(i=2;i<=m;i++) {
			if(p%2==0) {
				System.out.println(p+" is not a prime number");
				k=1;
				break;
			}
		}
if (k==0) {
	System.out.println(p+" is a prime number");
}
}
}