package Competitions;

import java.util.Scanner;

public class BrokenClass {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int j=0;j<t;j++) {
			int n=s.nextInt();
			int count=0;
			int[] message=new int[n];
			for(int i=0;i<message.length;i++) {
				message[i]=s.nextInt();
			}
			boolean prev=false;
			
			for(int i=0;i<message.length;i++) {				
				
				if(i+1>=message.length) {
					break;
				} else {				
					int current=message[i];
					int next=message[i+1];	
					if(next!=current) {
						if(prev) {
							count+=1;
							//prev=true;
						} else if(!prev) {
							count+=2;
							prev=true;
						}
						
					}
					else {
						prev=false;
					}
				}
			}
			
			
		System.out.println(count);	
		}
		
		
	}

}
