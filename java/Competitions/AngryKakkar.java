package Competitions;

import java.util.Scanner;

public class AngryKakkar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t;
	    t=s.nextInt();
	    for(int i=0;i<t;i++) {
	        int n;
	        n=s.nextInt();
	        //vector<int>s1;
	        //vector<int>s2;
	        int num=1;
	        int den1=1,den2=1;

	        for(int j=1;j<=2*n;j++) {
	            if( j%2==0 ) {
	                num*=j;
	            }
	            else if(j%2!=0) {
	                den1*=j;
	                den2*=j;
	            }

	        }
	        for(int j=2*n;j<=2*(n+1);j++) {
	            if(j%2!=0) {
	                den2*=j;
	            }
	        }
	       // double x=(num*num)/(den1*den2);
	        System.out.println((num*num)/(den1*den2));


	    }


	}

}
