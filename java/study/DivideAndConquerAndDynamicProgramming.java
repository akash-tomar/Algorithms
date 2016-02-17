package study;

public class DivideAndConquerAndDynamicProgramming {
	public static int[] maxSubArray(int[] arr,int index) {
		if(index<0) {
			int[] ans=new int[0];
			return ans;
		}
		int[] subAns=maxSubArray(arr,index-1);
		int sum=0;
		for(int x:subAns) {
			sum+=x;
		}
		if(sum+arr[index]>sum) {
			int[] ans=new int[subAns.length+1];
			for(int i=0;i<subAns.length;i++) {
				ans[i]=subAns[i];
			}
			ans[ans.length-1]=arr[index];
			return ans;
		}
		return subAns;
	}
	
	public static void main(String[] args) {
		int[] arr={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		arr=maxSubArray(arr, arr.length-1);
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
}
