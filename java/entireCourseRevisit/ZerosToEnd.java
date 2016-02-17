package entireCourseRevisit;

import java.util.Scanner;

public class ZerosToEnd {

	public static void zerosAtEnd(int[] arr) {
		int firstIndexOfZero=-1;
		boolean first=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0 && first) {
				firstIndexOfZero=i;
				first=false;
			}
			else if(arr[i]!=0 && !first){
				int temp=arr[firstIndexOfZero];
				arr[firstIndexOfZero]=arr[i];
				arr[i]=temp;
				firstIndexOfZero++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr={0,0,0,1,0,9,0,0,0,3,6,0,0,0,1,0,5};
		zerosAtEnd(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
