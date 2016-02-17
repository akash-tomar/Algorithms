package entireCourseRevisit;

public class SortZeroOneTwo {

	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void sortArray(int[] arr) {
		int currentZero=0,oneToBeAdded=1,twoToBeAdded=arr.length-1,i=0;
		while(true) {
			if(arr[i]==0) {
				swap(arr,currentZero+1,i);
				currentZero++;
				oneToBeAdded=i+1;
				i=oneToBeAdded;
			} else if(arr[i]==1) {
				swap(arr, i, oneToBeAdded);
				oneToBeAdded++;
				i=oneToBeAdded;
			} else if(arr[i]==2) {
				swap(arr, i, twoToBeAdded);
				twoToBeAdded--;
			}
			if(oneToBeAdded>=twoToBeAdded) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr={0,0,2,1,0,2,2,1,0,0,2};
		sortArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
