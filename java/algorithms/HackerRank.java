package algorithms;

import java.util.Scanner;

public class HackerRank {

	public static void gridSearch(String[] grid,String[] pattern) {
		int row=0,col=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length();j++) {
				row=0;
				col=0;
				if(grid[i].charAt(j)==pattern[row].charAt(col)) {
					int r=i,c=j;
					boolean truly=true;
					for(int y=r;y<grid.length;y++) {
						boolean found=true;
						for(int z=c;z<grid[0].length();z++) {
							if(grid[y].charAt(z)!=pattern[row].charAt(col)) {
								found=false;
								truly=false;
								break;
							}
							col=(col+1)%(pattern[0].length());
						}
						if(!found) {
							break;
						}
						row=(row+1)%(pattern.length);
					}
					if(truly) {
						System.out.println("YES");
						return;
					}
				}

			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		for(int test=0;test<t;test++) {

			int R=s.nextInt();
			int C=s.nextInt();

			String[] grid=new String[R];
			for(int i=0;i<R;i++) {
				String str=s.next();
				grid[i]=str;
			}

			int r=s.nextInt();
			int c=s.nextInt();

			String[] pattern=new String[r];
			for(int i=0;i<r;i++) {
					pattern[i]=s.next();
			}

			gridSearch(grid, pattern);
		}
	}

}
