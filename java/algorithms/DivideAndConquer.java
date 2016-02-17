package algorithms;

public class DivideAndConquer {
	//----------------------------------------------Max subarray---------------------------------------------------
	public static TripleInt crossingSubArray(int[] arr,int begin,int mid,int end) {
		TripleInt sum = new TripleInt();
		int leftSum=0;
		int sumarr=0;
		for(int i=mid;i>=begin;i--) {
			sumarr+=arr[i];
			if(leftSum<sumarr) {
				leftSum=sumarr;
				sum.beginIndex=i;
			}
		}
		sumarr=0;
		int rightSum=0;
		for(int i=mid+1;i<=end;i++) {
			sumarr+=arr[i];
			if(rightSum<sumarr) {
				rightSum=sumarr;
				sum.EndIndex=i;
			}
		}
		sum.sum=leftSum+rightSum;
		return sum;
	}
	
	public static TripleInt maxSubArray(int[] arr,int beginIndex,int endIndex) {
		if(beginIndex==endIndex) {
			TripleInt i = new TripleInt();
			i.beginIndex=beginIndex;
			i.EndIndex=endIndex;
			i.sum=arr[beginIndex];
			return i;
		}
		int mid=(beginIndex+endIndex)/2;
		TripleInt left=maxSubArray(arr,beginIndex,mid);
		TripleInt right=maxSubArray(arr, mid+1, endIndex);
		TripleInt cross=crossingSubArray(arr, beginIndex, mid, endIndex);
		int temp=Math.max(left.sum, Math.max(right.sum, cross.sum));
		if(temp==left.sum) 
			return left;
		else if(temp==right.sum)
			return right;
		else
			return cross;
	}
	 
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		for(int c:arr)
			System.out.println(c);
		TripleInt sum=maxSubArray(arr, 0, 15);
		System.out.println(sum.beginIndex+ " " +sum.EndIndex+" "+sum.sum);
	}

}
