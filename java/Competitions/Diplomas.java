import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int min1=s.nextInt();
		int max1=s.nextInt();
		int min2=s.nextInt();
		int max2=s.nextInt();
		int min3=s.nextInt();
		int max3=s.nextInt();
		n=n-(min1+min2+min3);
		int one,two,three;
		one=min1;
		two=min2;
		three=min3;
		if(n!=0) {
			if((max1-min1)>=n) {
				one+=n;
				System.out.println(one+" "+two+" "+three);
				return;
			} else {
				one=max1;
				n=n-(max1-min1);
				if((max2-min2)>=n) {
					two+=n;
					System.out.println(one+" "+two+" "+three);
					return;
				} else {
					two=max2;
					n=n-(max2-min2);
					if((max3-min3)>=n) {
						three+=n;
						System.out.println(one+" "+two+" "+three);
						return;
					} 
				}
			}
		}
		System.out.println(one+" "+two+" "+three);

	}

}
