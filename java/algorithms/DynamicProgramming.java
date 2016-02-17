package algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DynamicProgramming {
	/*public static ArrayList<Integer[]> rod=new ArrayList<Integer[]>();

	public static int[] rodCut(HashMap<Integer, Integer> lengthPrice,int n) {
		if(n==1) {
			int[] arr=new int[1];
			arr[0]=lengthPrice.get(1);
			rod=arr[0];
			return arr;
		}
		if(rod[n]==-1) {
			int[] subCuts=rodCut(lengthPrice, n-1);
			rod[n]=
		}


	}*/


	public static int maxSubArray(int[] arr,int n) {
		if(n==0) {
			return Integer.MIN_VALUE;
		}
		int ans=Integer.MIN_VALUE;
		int subRoutine=maxSubArray(arr, n-1);
		ans=Math.max(ans, subRoutine);
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int current=i;current<i+n;current++) {
				if(current<arr.length) {
					sum+=arr[current];
				}
			}
			ans=Math.max(ans, sum);
		}
		return ans;
	}



	public static int maxSubArray2(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int subarraySize=1;subarraySize<=arr.length;subarraySize++) {
				if(i+subarraySize-1<arr.length) {
					sum+=arr[i+subarraySize-1];
					ans=Math.max(ans, sum);
				}
			}
		}
		return ans;
	}

	public static int maxSubArray3(int[] arr) {
		int sum=0;int ans=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>0) {
				ans=Math.max(ans, sum);
			} else {
				sum=0;
			}
		}
		return ans;
	}

	public static BigInteger[] arr=new BigInteger[20];
	public static BigInteger fibonnaciModified(int a,int b,int n) {
		if(n==1) {
			String str=a+"";
			BigInteger t=new BigInteger(str);
			return t;
		}
		if(n==2) {
			String str=b+"";
			BigInteger t=new BigInteger(str);
			return t;	
		}
		BigInteger to=new BigInteger("-1");
		if(!arr[n].equals(to)) {
			return arr[n];
		}

		arr[n]=( fibonnaciModified(a, b, n-1).pow(2)).add(fibonnaciModified(a, b, n-2));
		return arr[n];

	}


	/*public static int changeSubset(ArrayList<Integer> subs,int n) {
		int sum=0;
		for(int i=0;i<subs.size();i++) {
			sum+=subs.get(i);
		}
		if(sum>n) {
			
		}
	}*/


	public static ArrayList<ArrayList<Integer>> getSubsets(int[] arr,int index) {
		if(index==arr.length-1) {
			ArrayList<ArrayList<Integer>> temp= new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> temp1=new ArrayList<Integer>();
			temp1.add(arr[index]);
			temp.add(temp1);
			return temp;
		}
		ArrayList<ArrayList<Integer>> subs=getSubsets(arr, index+1);
		int size=subs.size();
		for(int i=0;i<size;i++) {
			ArrayList<Integer> temp=subs.get(i);
			ArrayList<Integer> newlist=new ArrayList<Integer>();
			for(int j=0;j<temp.size();j++) {
				newlist.add(temp.get(j));
			}
			subs.add(newlist);
		}
		for(int i=0;i<size;i++) {
			(subs.get(i)).add(arr[index]);
		}
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		newlist.add(arr[index]);
		subs.add(newlist);
		return subs;
	}
	public static int[] coins=new int[251];
	public static int coinChangeProblem(int[] arr,int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(coins[n]!=-1) {
			return coins[n];
		}
		int count=0;
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
				break;
			}
		}*/
		
		for(int i=0;i<arr.length;i++) {
			count+=coinChangeProblem(arr, n-arr[i]);
		}
		coins[n]=count;
		return count;
	}
	public static int[][] coin=new int[251][51];
	public static int coinChange(int amountToBeMade,int index, int[] coins) {
		if( amountToBeMade < 0 ) {
			return 0;
		}
		if( amountToBeMade == 0 ) {
			return 1;
		}
		if( index<0 ) {
			return 0;
		}
		if(coin[amountToBeMade][index]!=-1) {
			return coin[amountToBeMade][index];
		}
		coin[amountToBeMade][index]=coinChange(amountToBeMade, index-1, coins)+coinChange(amountToBeMade-coins[index], index, coins);		
		return coin[amountToBeMade][index];
	}
	
	
	public static void minCandies(int index,int[] candies,int[] rating) {
		if(index<0)
			return;
		
		minCandies(index-1, candies, rating);
		if(index-1>=0) {
			if(index+1<candies.length) {
				if(rating[index]>rating[index-1] && rating[index]>rating[index+1]) {
					candies[index]=Math.max(candies[index-1], candies[index+1])+1;
				}
				else if(rating[index]>rating[index-1]) {
					candies[index]=candies[index-1]+1;
				}
				else if(rating[index]>rating[index+1]) {
					candies[index]=candies[index+1]+1;
				}
			}
		} else if(index-1>0) {
			if(rating[index]>rating[index-1]) {
				candies[index]=candies[index-1]+1;
			}
		} else if(index+1<candies.length) {
			if(rating[index]>rating[index+1]) {
				candies[index]=candies[index+1]+1;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		/*for(int i=0;i<20;i++) {
			String str="-1";
			arr[i]=new BigInteger(str);
		}
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=s.nextInt();
		System.out.println(fibonnaciModified(a,b,n));*/
		
		/*System.out.println(maxSubArray(arr, 6));
		System.out.println(maxSubArray2(arr));
		System.out.println(maxSubArray3(arr));

		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {
			int n=s.nextInt();
			int[] arr1=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			System.out.println(maxSubArray3(arr1));
		}*/

		//ArrayList<ArrayList<Integer>> subs=getSubsets(arr, 0);
//		ArrayList<Integer> temp=subs.get(0);
//		temp.add(10101010);
		//System.out.println(temp);
		
		/*for(int i=0;i<subs.size();i++) {
			for(int j=0;j<subs.get(i).size();j++) {
				System.out.print(subs.get(i).get(j)+" " );
			}
			System.out.println();
		*/
		/*for(int i=0;i<251;i++) {
			coins[i]=-1;
		}
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=s.nextInt();
		}
			
//		S*///ystem.out.println(coinChangeProblem(arr, n));
		
		Scanner s = new Scanner(System.in);
//		/*int n=s.nextInt();
//		int m=s.nextInt();
//		int[] coins = new int[m];
//		for(int i=0;i<m;i++) {
//			coins[i]=s.nextInt();
//		}
//		for(int i=0;i<coin.length;i++) {
//			for(int j=0;j<coin[i].length;j++) {
//				coin[i][j]=-1;
//			}
//		}
//		S*/ystem.out.println(coinChange(n,coins.length-1,coins));
		
		int n=s.nextInt();
		int[] rating=new int[n];
		int[] candies=new int[n];
		for(int i=0;i<n;i++) {
			rating[i]=s.nextInt();
			candies[i]=0;
		}
		minCandies(n,candies,rating);
		int candy=0;
		for(int i=0;i<n;i++) {
			candy+=candies[i];
		}
		candy+=n;
		System.out.println(candy);
	}
}
