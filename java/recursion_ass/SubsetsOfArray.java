package recursion_ass;

import java.util.Scanner;

public class SubsetsOfArray {

	/**
	 * @param args
	 */
		
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
		long startTime=System.currentTimeMillis();
		int[][] output=subSet(arr);
		long endTime=System.currentTimeMillis();
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				if(output[i][j]!=-1)
					System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Time :  "+(endTime-startTime));
		
	}

}
