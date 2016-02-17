package Competitions;

public class devuAndSubsequence {

	/**
	 * @param args
	 */
	
	public class doubleVal {
		int value[][];
		int index;
	}
	
	
	public static doubleval subSet(int[] arr) {
		if(arr.length==1) {
			doubleVal tempVal=new doubleVal();
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

	}

}
