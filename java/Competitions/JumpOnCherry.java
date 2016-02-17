package Competitions;

import java.util.Scanner;

public class JumpOnCherry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
	    //cin>>t;
	    for(int i=0;i<t;i++) {

	        int x,y;
	        int pos=0;
	        int var=1;
	        int counts=0;
	        x=s.nextInt();
	        y=s.nextInt();
	        int[] cherry=new int[1000000];
	        while(true) {

	            pos+=x;
	            counts++;
	            cherry[pos+(y*var)]=1;
	            if(cherry[pos]==1){
	                System.out.println(counts);
	                break;
	            }
	            var++;
	        }


	    }

	}

}
