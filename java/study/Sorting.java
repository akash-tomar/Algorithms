package study;

public class Sorting {

	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
	}

	public static void insertonSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int index=i;
			for(int j=i-1;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
					index=j;
				} else {
					break;
				}
			}
			arr[index]=temp;
		}
	}

	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}

	public static void mergeSort(int[] arr,int beginIndex,int endIndex) {
		if(beginIndex<endIndex) {
			int middleIndex=(beginIndex+endIndex)/2;
			mergeSort(arr, beginIndex, middleIndex);
			mergeSort(arr, middleIndex+1, endIndex);
			merge(arr,beginIndex,middleIndex,endIndex);
		}
	}

	public static void merge(int[] arr,int beginIndex,int middleIndex,int endIndex) {
		int[] left=new int[middleIndex-beginIndex+1];
		int[] right=new int[endIndex-middleIndex];
		int leftIndex=0,rightIndex=0;
		for(int i=beginIndex;i<=middleIndex;i++) {
			left[leftIndex]=arr[i];
			leftIndex++;
		}
		for(int i=middleIndex+1;i<=endIndex;i++) {
			right[rightIndex]=arr[i];
			rightIndex++;
		}

		leftIndex=0;
		rightIndex=0;

		int k=beginIndex;
		while(k<=endIndex) {
			if(rightIndex>=right.length) {
				arr[k]=left[leftIndex];
				leftIndex++;
			}
			else if(leftIndex>=left.length) {
				arr[k]=right[rightIndex];
				rightIndex++;
			}
			else {
				if(left[leftIndex]<right[rightIndex]) {
					arr[k]=left[leftIndex];
					leftIndex++;
				} else {
					arr[k]=right[rightIndex];
					rightIndex++;
				}

			}
			k++;
		}

	}

	public static void quickSort(int[] arr,int begin,int end) {
		if(begin<end) {
			int pivot=partition(arr,begin,end);
			quickSort(arr, begin, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}

	public static int partition(int[] arr,int begin,int end) {
		int pivot=end;
		int x=begin;
		for(int i=begin;i<end;i++) {
			if(arr[i]<arr[pivot]) {
				int temp=arr[i];
				arr[i]=arr[x];
				arr[x]=temp;
				x++;
			} 
		}
		int temp=arr[pivot];
		arr[pivot]=arr[x];
		arr[x]=temp;
		return x;
	}

	public static int binarySearch(int[] arr,int begin,int end,int x) {
		int mid=(begin+end)/2;
		if(arr[mid]>x) {
			return binarySearch(arr, begin, mid, x);
		} else if(arr[mid]<x) {
			return binarySearch(arr, mid+1, end, x);
		} else if(arr[mid]==x) {
			return mid;
		}
		return -2;
	}




	//----------------O(n) time complexity-----------------
	public static int[] countingSort(int[] arr,int maxNumber) {
		int[] ans=new int[arr.length];
		int[] working=new int[maxNumber+1];
		
		//since java initializes an array with zero by default.
		/*for(int i=0;i<working.length;i++) {
			working[i]=0;
		}*/


		//-----Maintaining the count of each variable----------
		for(int x:arr) {
			working[x]++;
		}


		//------Maintaining the record of number of variables equal and smaller than the index value------------
		for(int i=1;i<working.length;i++) {
			working[i]+=working[i-1];
		}



		for(int i=0;i<arr.length;i++) {
			ans[working[arr[i]]-1]=arr[i];
			working[arr[i]]-=1;
		}
		return ans;
	}
	//-----------------------------------------------------







	//-----------------RADIX SORT------------------------
	public static void radixSort(int[][] arr) {
		for(int i=arr[0].length-1;i>=0;i--) {
			sort(arr,i);
		}
	}


	public static void sort(int[][] arr,int index) {
		for(int i=0;i<arr.length;i++) {
			int min=arr[i][index];
			int pos=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j][index]<min) {
					min=arr[j][index];
					pos=j;
				}
			}
			int[] temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}

	//---------------------------------------------------

	//---------------HEAP SORT---------------------------

	public static void heapSort(int[] arr) {
		buildMaxHeap(arr);
		int heapSize=arr.length;
		for(int i=arr.length-1;i>=1;i--) {
			swap(arr,i,0);
			heapSize-=1;
			maxHeapify(arr,heapSize,0);
		}
	}

	public static void swap(int[] arr,int n1,int n2) {
		int temp=arr[n1];
		arr[n1]=arr[n2];
		arr[n2]=temp;
	}

	public static void maxHeapify(int[] arr,int heapSize,int pos) {
		int largest=pos;
		if(2*pos+1<heapSize) {
			if(arr[pos]<arr[2*pos+1]) {
				largest=2*pos+1;
			}
		}
		if(2*pos+2<heapSize) {
			if(arr[pos]<arr[2*pos+2] && arr[2*pos+2]>arr[2*pos+1]) {
				largest=pos*2+2;
			}
		}
		if(largest!=pos) {
			swap(arr, pos, largest);
			maxHeapify(arr, heapSize, largest);
		}
	}

	public static void buildMaxHeap(int [] arr) {
		for(int i=arr.length/2-1;i>=0;i--) {
			maxHeapify(arr, arr.length, i);
		}
	} 
//-----------------end heap sort------------------------



	public static void main(String[] args) {
		int[] sort={9,8,7,6,34,65,87,5,5,4,3,2,1};
		//bubbleSort(sort);

		/*quickSort(sort, 0, 13);
		for(int x: sort) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(binarySearch(sort, 0, 13, 31)+1);
		 */
		/*sort=countingSort(sort, 87);
		for(int x: sort) {
			System.out.print(x+" ");
		}

		int[][] arr={{1,2,3},{4,3,2},{1,0,2},{3,2,1},{2,5,1}};
		radixSort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
		
		heapSort(sort);
		for(int x: sort) {
			System.out.print(x+" ");
		}
	}

}
