package spoj;

import java.util.Scanner;


public class GridSearch {
	static class DoubleVal {
		public boolean isMatching;
		public int startindex;
		public int endindex;
	}	

	public static DoubleVal isMatching(String G,String P,int indice) {
		if(G.length()!=P.length()) {
			for(int i=indice+1;i<G.length()-P.length();i++) {
				for(int k=0;k<P.length();k++) {
					if(G.charAt(i+k)==P.charAt(k)) {
						if(k==P.length()-1) {
							DoubleVal d = new DoubleVal();
							d.startindex=i;
							d.endindex=i+k;
							d.isMatching=true;
							return d;
						}
					} else {
						break;
					}
				}
			}
			DoubleVal d1 = new DoubleVal();
			d1.startindex=-1;
			d1.endindex=-1;
			d1.isMatching=false;
			return d1; 
		} else {
			if(G.equals(P)) {
				DoubleVal d = new DoubleVal();
				d.startindex=0;
				d.endindex=P.length()-1;
				d.isMatching=true;
				return d;
			} else {
				DoubleVal d1 = new DoubleVal();
				d1.startindex=-1;
				d1.endindex=-1;
				d1.isMatching=false;
				return d1;
			}
		}
	}

	public static boolean isSame(String G,String P, int index) {
		if(G.length()!=P.length()) {
			for(int i=index;i<index+P.length();i++) {
				for(int k=0;k<P.length();k++) {
					if(G.charAt(i+k)==P.charAt(k)) {
						if(k==P.length()-1) {
							return true;
						}
					} else {
						break;
					}
				}
			}
			return false;
		} else {
			if(G.equals(P)) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int test=0;test<t;test++) {
			int R=sc.nextInt();
			int C=sc.nextInt();
			boolean yes=false;
			String G[]=new String[R];
			for(int i=0;i<R;i++) {
				G[i]=sc.next();
			}
			int r=sc.nextInt();
			int c=sc.nextInt();
			String P[]=new String[r];
			for(int i=0;i<r;i++) {
				P[i]=sc.next();
			}
			int i=0,j=0;
			int indice=0;
			while(true) {
				j=0;
				if(indice!=G[0].length()-P[0].length()-1) {
					String str="akash";
					
					System.out.println(str.contains("ak"));
					
				}
				DoubleVal d = isMatching(G[i],P[j],indice);
				if(d.isMatching) {
					i++;
					j++;
				} else {
					i++;
				}
				if(j==P.length) {
					System.out.println("YES");
					yes=true;
					break;
				}
				if(i==G.length) {
					break;
				}
				if(d.isMatching) {
					while(true) {
						if(isSame(G[i], P[j], d.startindex)) {
							i++;
							j++;
						} else {
							break;
						}
						if(j==P.length) {
							System.out.println("YES");
							yes=true;
							break;
						}
						if(i==G.length) {
							break;
						}
					}
				}
				if(yes) {
					break;
				}
				
				if(i==G.length) {
					break;
				}
			}
			if(yes) {
				continue;
			}
			System.out.println("NO");
		}
	}
}
