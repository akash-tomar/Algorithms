package ArraysAndStringsAss;

import java.util.Scanner;

public class MergeTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size1,size2;
		System.out.println("Enter the size of 1st array : ");
		size1=s.nextInt();
		System.out.println("Enter the first array : ");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the size of 2nd array : ");
		size2=s.nextInt();
		System.out.println("Enter the second array : ");
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=s.nextInt();
		}
		int[] output=new int[size1+size2];
		int i=0;
		int j=0;
		
		for(int k=0;k<output.length;k++) {
			
			if(arr1.length>i && arr2.length>j ) {
				if(arr1[i]<arr2[j]) {
					output[k]=arr1[i];
					i++;
				}			
				else{				
					output[k]=arr2[j];
					j++;				
				}
			}
			else if( i>=arr1.length ) {
				output[k]=arr2[j];
				j++;
			}
			else if( j>=arr2.length ) {
				output[k]=arr1[i];
				i++;
			}			
				
		}
		for(int k=0;k<output.length;k++)
			System.out.print(output[k]+" ");
		

	}

}
