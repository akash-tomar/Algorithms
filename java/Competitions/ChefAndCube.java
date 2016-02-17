package Competitions;

import java.util.Scanner;

public class ChefAndCube {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			String front=s.next();
			String back=s.next();
			String left=s.next();
			String right=s.next();
			String top=s.next();
			String bottom=s.next();
			
			if(front.equals(left)) {
				if(left.equals(top) || left.equals(bottom)) {
					System.out.println("YES");
					break;
				}
			}
			else if(front.equals(right)) {
				if(right.equals(top) || right.equals(bottom)) {
					System.out.println("YES");
					break;
				}
			}
			else if(back.equals(left)) {
				if(left.equals(top) || left.equals(bottom)) {
					System.out.println("YES");
					break;
				}
			}
			else if(back.equals(right)) {
				if(right.equals(top) || right.equals(bottom)) {
					System.out.println("YES");
					break;
				}
			}
			else
				System.out.println("NO");
			
		}
		
	}
}
