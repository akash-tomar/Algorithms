package recursion_ass;

import java.util.HashMap;

public class twoSortedArrayTraverseMethods {

	public static int maxSumPossible(int[] a,int[] b,int beginA,HashMap<Integer, Integer> mapA,HashMap<Integer, Integer> mapB) {
		if(beginA>=a.length) {
			return 0;
		}
		int i=beginA;
		int sumSoFar=0;
		while(true) {
			if(mapB.get(a[i])==null) {
				sumSoFar+=a[i];
				i++;
			} else {
				sumSoFar+=a[i];
				i++;
				break;
			}
			if(i>=a.length)
				break;
		}
		int subOutputA=0;
		int subOutputB=0;
		int begB;
		if(i<a.length)
			subOutputA=maxSumPossible(a, b, i,mapA,mapB);
		if(mapB.get(a[i-1])!=null) {
			begB=mapB.get(a[i-1]);
		    if(begB+1<b.length)
		    	subOutputB=maxSumPossible(b, a, begB+1,mapB, mapA);
		}
		return sumSoFar+Math.max(subOutputA, subOutputB);
	}


	public static int returnMaxSum(int[] A,int[] B) {
		HashMap<Integer, Integer> mapA=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapB= new HashMap<Integer, Integer>();
		for(int i=0;i<A.length;i++) {
			mapA.put(A[i], i);
		}
		for(int i=0;i<B.length;i++) {
			mapB.put(B[i], i);
		}
		int maxA=maxSumPossible(A, B, 0,  mapA, mapB);
		int maxB=maxSumPossible(B, A, 0,  mapB, mapA);
		return Math.max(maxA, maxB);
	}



	public static void main(String[] args) {
		int[] A={2,4,6,8,10,12,14};
		int[] B={1,3,6,7,9,10,14,15};
		System.out.println(returnMaxSum(A, B));
	}
}
