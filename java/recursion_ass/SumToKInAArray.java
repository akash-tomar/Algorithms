package recursion_ass;

import java.util.Scanner;

public class SumToKInAArray {

	/**
	 * @param args
	 */
//	public static String[] sumToK(String str,int k) {
//		if(str.length()==1) {
//			if( str.charAt(0)<=k ) {
//				String[] temp=new String[1];
//				temp[0]=str.charAt(0)+"";
//				return temp;
//			}
//			else {
//				String[] temp=new String[1];
//				temp[0]="";
//				return temp;
//			}
//		}
//		
//		char c=str.charAt(0);
//		String[] subOutput=sumToK(str.substring(1), k);
//		String[] output=new String[2*subOutput.length];
//		int next=0;
//		for(int current=0;current<subOutput.length;current++) {
//			int currentSum=0;
//			for(int i=0;i<subOutput[current].length();i=i+2) {
//				currentSum+=(subOutput[current].charAt(i)-'0');
//			}
//			output[next]="";
//			if(currentSum<=k) {
//				for(int i=0;i<subOutput[current].length();i=i+2) {
//					if(i!=subOutput[current].length()-1) {
//							output[next]=output[next].concat(subOutput[current].charAt(i)+" ");
//					}
//					else
//						output[next]=output[next].concat(subOutput[current].charAt(i)+"");
//				}
//				next++;
//			}
//				
//		}
//		for(int current=0;current<subOutput.length;current++) {
//			int currentSum=c-'0';
//			for(int i=0;i<subOutput[current].length();i=i+2) {
//				currentSum+=(subOutput[current].charAt(i)-'0');
//			}
//			output[next]="";
//			if(currentSum<=k) {
//				for(int i=0;i<subOutput[current].length();i=i+2) {
//					if(i!=subOutput[current].length()-1) {
//							output[next]=output[next].concat(c+" ");
//							output[next]=output[next].concat(subOutput[current].charAt(i)+" ");
//					}
//					else {
//						output[next]=output[next].concat(c+" ");
//						output[next]=output[next].concat(subOutput[current].charAt(i)+"");
//					}
//				}
//				next++;
//			}
//				
//		}
//		return output;
//		
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		String arr;
//		System.out.println("Enter the array : ");
//		arr=s.nextLine();
//		int k;
//		System.out.println("Enter k : ");
//		k=s.nextInt();
//		String[] output=sumToK(arr,k);
//		for(int currentString=0;currentString<output.length;currentString++) {
//			int currentSum=0;
//			for(int currentDigit=0;currentDigit<output[currentString].length();currentDigit=currentDigit+2) {
//				currentSum+=(output[currentString].charAt(currentDigit)-'0');
//			}
//			if(currentSum==k) {
//				System.out.println(output[currentString]);
//			}
//		}
//
//	}
	
	public static int[][] subSet(int[] arr) {
		if(arr.length==1) {
			int[][] out=new int[2][1];
			out[0][0]=-1;
			out[1][0]=arr[0];
			return out;
		}
		int c=arr[0];
		int[] subArray=new int[arr.length-1];
		for(int i=0;i<subArray.length;i++)
			subArray[i]=arr[i+1];
		int[][] subOutput=subSet(subArray);
		int[][] output=new int[subOutput.length*2][subOutput.length];
		int nextSet=0;
		int nextInt=0;
		for(int currentSet=0;currentSet<subOutput.length;currentSet++) {
		    nextInt=0;
			for(int currentInt=0;currentInt<subOutput[currentSet].length;currentInt++) {
				output[nextSet][nextInt]=subOutput[currentSet][currentInt];
				nextInt++;
			}
			nextSet++;
		}
		for(int currentSet=0;currentSet<subOutput.length;currentSet++) {
			nextInt=0;
			output[nextSet][nextInt]=c;
			nextInt++;			
			for(int currentInt=0;currentInt<subOutput[currentSet].length;currentInt++) {
				output[nextSet][nextInt]=subOutput[currentSet][currentInt];
				nextInt++;
			}
			nextSet++;
		}
		return output;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size=s.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		int k;
		System.out.println("Enter k : ");
		k=s.nextInt();
		int[][] output=subSet(arr);
		for(int i=0;i<output.length;i++) {
			int sum=0;
			for(int j=0;j<output[i].length;j++) {
				if(output[i][j]!=0 && output[i][j]!=-1)
					sum+=output[i][j];
			}
			if(sum==k){
				for(int j=0;j<output[i].length;j++) {
					if(output[i][j]!=0 && output[i][j]!=-1)
						System.out.print(output[i][j]);
				}
			}
			System.out.println();
		}
		
	}
	
	

}
