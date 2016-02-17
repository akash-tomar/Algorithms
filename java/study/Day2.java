package study;

import java.util.HashMap;

public class Day2 {
	public static int[] pushAllZeroesToTheEnd(int[] arr) {
		/*int begin=0,end=arr.length-1;
		while(begin<end) {
			if(arr[begin]==0) {
				while(true) {
					if(arr[end]!=0) {
						break;
					}
					end--;
				}
				arr[begin]=arr[end];
				arr[end]=0;
				end--;
				begin++;
			} else {
				begin++;
			}
		}*/
		
		int[] temp=new int[arr.length];
		int i=0;
		for(int x: arr) {
			if(x!=0) {
				temp[i]=x;
				i++;
			}
		}
		for(int j=i;j<temp.length;j++) {
			temp[j]=0;
		}
		/*for(int j=0;j<temp.length;j++) {
			arr[j]=temp[j];
		}*/
		return temp;
		
	}

	public static int clockwiseRotation(int[] arr) {
		int prev=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<prev) {
				return i;
			}
			prev=arr[i];
		}
		return -1;
	}
	
	public static void sortZeroesOnesInOneScan(int[] arr) {
		int begin=0,end=arr.length-1;
		while(begin<end) {
			if(arr[begin]==1) {
				while(true) {
					if(begin>=end) {
						return;
					}
					if(arr[end]==0) {
						break;
					}
					end--;
				}
				arr[begin]=0;
				arr[end]=1;
				begin++;
				end--;
			} else {
				begin++;
			}
		}
	}
	
	
	public static void sortZerosOnesTwosInOneScan(int[] arr) {
		int zerosBeforeThisIndexAndOnesStartingIndex=0;
		int onesBeforeThisIndex=1;
		int twosAfterThisIndex=arr.length-1;
		while(onesBeforeThisIndex<=twosAfterThisIndex) {
			if(arr[onesBeforeThisIndex]==0) {
				if(arr[zerosBeforeThisIndexAndOnesStartingIndex]==0) {
					onesBeforeThisIndex++;
					continue;
				}
				int temp=arr[zerosBeforeThisIndexAndOnesStartingIndex];
				arr[zerosBeforeThisIndexAndOnesStartingIndex]=0;
				arr[onesBeforeThisIndex]=temp;
				zerosBeforeThisIndexAndOnesStartingIndex++;
			} else if(arr[onesBeforeThisIndex]==1) {
				onesBeforeThisIndex++;
			} else if(arr[onesBeforeThisIndex]==2) {
				arr[onesBeforeThisIndex]=arr[twosAfterThisIndex];
				arr[twosAfterThisIndex]=2;
				twosAfterThisIndex--;
			}
		}
		
	}
 	
	public static int duplicateNumberInArray(int[] arr) {
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		for(int x:arr) {
			if(!map.containsKey(x)) {
				map.put(x, true);
			}
			else {
				return x;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] arr={2,4,0,66,0,3,0,6,0,0,0,4,7};
		arr=pushAllZeroesToTheEnd(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		int[] sorted={5,6,7,1,2,3,4};
		System.out.println(clockwiseRotation(sorted));
		
		int[] zerone={1,0,0,1,0,1,1,0,0,0,1,1,0,1,0};
		sortZeroesOnesInOneScan(zerone);
		for(int x:zerone) {
			System.out.print(x+" ");
		}
		System.out.println();
		int[] dup={0,1,2,7,6,5,4,3,5};
		System.out.println(duplicateNumberInArray(dup));
		
		
		int[] onetwo={0,0,1,0,2,0};
		sortZerosOnesTwosInOneScan(onetwo);
		for(int x:onetwo) {
			System.out.print(x+" ");
		}
		
	}
}
