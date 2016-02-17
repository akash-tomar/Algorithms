package study;

import java.util.HashMap;

public class Day1 {
	public static String getBinaryFromDecimal(int x) {
		String arr="";
		while(true) {
			int remainder=x%2;
			x=x/2;
			arr=arr.concat(remainder+"");
			if(x<2) {
				arr=arr.concat(x+"");
				break;
			}
		}
		String ans="";
		for(int i=arr.length()-1;i>=0;i--) {
			ans=ans.concat(arr.charAt(i)+"");
		}
		return ans;
	}

	public static int[] getIntersectionOfTwoArrays(int[] arr1,int[] arr2) {
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		int[] ans=new int[Math.max(arr1.length, arr2.length)];
		for(int i=0;i<arr1.length;i++) {
			map1.put(arr1[i], true);
		}
		int index=0;
		for(int i=0;i<arr2.length;i++) {
			if(map1.containsKey(arr2[i])) {
				ans[index]=arr2[i];
				index++;
			}
		}
		return ans;

	}

	public static String getStringWithoutDupicates(String str) {
		String prev=str.charAt(0)+"";
		String ans=str.charAt(0)+"";
		for(int i=1;i<str.length();i++) {
			if(!prev.equals((str.charAt(i)+""))) {
				ans=ans.concat(str.charAt(i)+"");
			}
			prev=str.charAt(i)+"";
		}
		return ans;

	}

	public static char getHighestOccuringCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char highest=str.charAt(0);
		int maxLength=0;
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
				if(maxLength==0) {
					maxLength=1;
					highest=str.charAt(i);
				}
			}
			int len=map.get(str.charAt(i));
			map.put(str.charAt(i), len+1);
			if(len+1>maxLength) {
				maxLength=len+1;
				highest=str.charAt(i);

			}
		}
		return highest;
	}

	public static void sortArrayOfStringBasedOnLength(String[] arr) {
		for(int j=0;j<arr.length;j++) {
			int max=0;
			String maxStr="";
			int index=-1;
			for(int i=j;i<arr.length;i++) {
				if(arr[i].length()>max) {
					max=arr[i].length();
					maxStr=arr[i];
					index=i;
				}
			}
			if(index!=-1) {
				String temp=arr[j];
				arr[j]=maxStr;
				arr[index]=temp;
			}
		}
	}

	public static void pairsSumToXInArray(int[] arr,int x) {
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], true);
		}
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(x-arr[i])) {
				System.out.println(arr[i]+" ,"+(x-arr[i]));
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int minIndex=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					minIndex=j;
					min=arr[j];
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[minIndex]=temp;
		}
	}


	public static void reverseArray(int[] arr) {
		int begin=0,end=arr.length-1;
		while(begin<end) {
			int temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			begin++;
			end--;
		}
	}
	
	public static void tripletSum(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if((arr[i]+arr[j]+arr[k])==x) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}

	public static int[] sumOfTwoArrays(int[] arr1,int[] arr2) {
		int[] ans=new int[Math.max(arr1.length, arr2.length)];
		int i=0;
		for(i=0;i<Math.min(arr1.length, arr2.length);i++) {
			ans[i]=arr1[i]+arr2[i];
		}
		if(arr1.length<arr2.length) {
			for(int j=i;j<arr2.length;j++) {
				ans[j]=arr2[j];
			}
		} else {
			for(int j=i;j<arr1.length;j++) {
				ans[j]=arr1[j];
			}
		}
		return ans;
	}

	public static String stringCompression(String str) {
		char prev=str.charAt(0);
		String ans=str.charAt(0)+"";
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==prev && i!=str.length()-1) {
				count++;
			}
			else
				if(str.charAt(i)==prev && i==str.length()-1) {
					count++;
					ans=ans.concat(count+"");
				}
			else {
				if(count!=1) {
					ans=ans.concat(count+"");
					ans=ans.concat(str.charAt(i)+"");
					count=1;
				} else {
					ans=ans.concat(str.charAt(i)+"");
					count=1;
				}
			}
			prev=str.charAt(i);
		}
		return ans;
	}
	

	
	public static void main(String[] args) {
		int x=100;
		System.out.println(getBinaryFromDecimal(x));
		int[] arr1={1,2,3,4,5};
		int[] arr2={4,8,2,2,9};
		int[] arr=getIntersectionOfTwoArrays(arr1, arr2);
		for(int x1: arr) {
			if(x1!=0)
				System.out.println(x1);
		}

		System.out.println(getStringWithoutDupicates("aabbssssssb"));
		System.out.println(getHighestOccuringCharacter("aabbbabbkandcaknaadkcaaanaaasdbbbbb"));

		String[] strings={"asdbSJD","abc","Js","s","jsdcjasacad"};
		sortArrayOfStringBasedOnLength(strings);
		for(String s:strings) {
			System.out.println(s);
		}
		int[] a={1,4,5,7,8,42,-1,-3,5};
		pairsSumToXInArray(a,5);
		int[] sort={2,1,4,7,3,9,0};
		selectionSort(sort);
		for(int i: sort) {
			System.out.print(i+" ");
		}
		System.out.println();
		reverseArray(sort);
		for(int i: sort) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(stringCompression("aaabbbbbaaababababba"));
		int[] ar={1,2,3,-1,-2,-3,0};
		tripletSum(ar, 3);
	}
}
