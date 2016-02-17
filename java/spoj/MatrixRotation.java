package spoj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int r=s.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int x_left=0;
		int x_right=n-1;
		int y_up=0;
		int y_down=m-1;
		while(true) {
			/*adding to queue*/
			//upper row
			for(int i=x_left;i<=x_right;i++) {
				q.add(arr[y_up][i]);
			}
			
			//right column
			for(int j=y_up+1;j<=y_down;j++) {
				q.add(arr[j][x_right]);
			}
			
			//bottom row
			for(int i=x_right-1;i>=x_left;i--) {
				q.add(arr[y_down][i]);
			}
			
			//left column
			for(int j=y_down-1;j>=y_up+1;j--) {
				q.add(arr[j][x_left]);
			}
			
			//rotation
			int count=0;
			int tempRot=r%q.size();
			while(count<tempRot) {
				q.add(q.remove());
				count++;
			}
			
			/*setting up the matrix again*/
			//upper row
			for(int i=x_left;i<=x_right;i++) {
				arr[y_up][i]=q.remove();
			}
			
			//right column
			for(int j=y_up+1;j<=y_down;j++) {
				arr[j][x_right]=q.remove();
			}
			
			//bottom row
			for(int i=x_right-1;i>=x_left;i--) {
				arr[y_down][i]=q.remove();
			}
			
			//left column
			for(int j=y_down-1;j>=y_up+1;j--) {
				arr[j][x_left]=q.remove();
			}
			
			//Changing the walls
			x_left++;
			x_right--;
			y_up++;
			y_down--;
			
			if(x_left>x_right) {
				break;
			}
			if(y_up>y_down) {
				break;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
