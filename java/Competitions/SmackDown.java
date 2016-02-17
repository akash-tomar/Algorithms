//package Competitions;

import java.util.ArrayList;
import java.util.Scanner;

class Codechef {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++){
			
			int n=s.nextInt();
			int[] arr=new int[n];
			int total=0;
			int countZeros=0;
			ArrayList<Integer> nonZerosPos=new ArrayList<Integer>();
			int[] votesOfThis = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				total+=arr[i];
				if(arr[i]==0) 
					countZeros++;
				else 
					nonZerosPos.add(i);
				votesOfThis[i]=0;
			}
			if(total!=n) {
				System.out.println("-1");
				continue;
			}
			if(countZeros==n-1) {
				System.out.println("-1");
				continue;
			}
			int[] output=new int[n];
			while(!nonZerosPos.isEmpty()) {
				int curPos=nonZerosPos.get(0);
				nonZerosPos.remove(0);
				int count=arr[curPos];
				int tempCount=0;
				for(int z=0;z<n;z++) {
					if(votesOfThis[z]==0 && z!=curPos) {
						votesOfThis[z]=curPos;
						tempCount++;
						if(tempCount==count) {
							break;
						}
					}
				}
			}
			//System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print((votesOfThis[i]+1)+" ");
				
			}
			System.out.println();
			
			
		}

	}

}
