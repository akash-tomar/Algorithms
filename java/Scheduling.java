import java.util.Scanner;


public class Scheduling {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of process");
		int n = sc.nextInt();
		System.out.println("enter the the process and the priority");
        Pair[] output= new Pair[n];
		for(int i =0;i<n;i++){
			System.out.println("Enter the process name");
			String name=sc.next();
			int time=sc.nextInt();
			int priority=sc.nextInt();
			Pair  pair = new Pair(name, time, priority);
			output[i]=pair;
		}
		
		for(int i =0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(output[j].priority<output[i].priority){
					Pair temp = output[i];
					output[i]=output[j];
					output[j]=temp;
				}
			}
		}
		
		for(Pair p: output){
			System.out.print("|");
			for(int i=0;i<p.time;i++){
				System.out.print("-");
				System.out.print("_");
			}
			
			
		}
		
	
	}

}
