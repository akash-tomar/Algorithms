import java.util.ArrayList;
import java.util.Scanner;


public class ChefAndStrange {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		long[]  input1=new long[n];
		long[] input2=new long[n];
		for(int i =0;i<n;i++){
			input1[i]=sc.nextLong();
		}
		for(int i =0;i<n;i++){
			input2[i]=sc.nextLong();
		}

		long[][] matrix=new long[n][n];
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){

				matrix[i][j]=input1[i]*input2[j]+i*input2[j]+j*input1[i]+i*j;

			}

			ArrayList<Long> output=new ArrayList<Long>();
			ArrayList<Long> kOutput=new ArrayList<Long>();
			long Max=0;
			int count=0;
			for(int k=1;k<=n;k++){
				for(int j=0;j<n-k;j++){
					for(int l=0;l<n-k;l++){
						if(matrix[j][l]>Max){
							Max=matrix[j][l];
							count++;
						}else{
							count++;
						}
						if(count==k*k){
							output.add(Max);
							Max=0;
							count=0;
						}
					}
				}
				kOutput.add(findk(output));
				output=new ArrayList<Long>();
			}
			for(long a:kOutput){
				System.out.print(a+" ");
			}
		}
	}

	public static long findk(ArrayList<Long> list){
		long sum=0;
		for(int i =0;i<list.size();i++){
			sum+=list.get(i);
		}

		return sum%(1000000007);
	}

}
