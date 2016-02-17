import java.awt.Polygon;
import java.util.Scanner;


public class blah {
	static class Pair {
		int x;
		int y;
		int c;
		public Pair(int x,int y,int c){
			this.x=x;
			this.y=y;
			this.c=c;
		}
	}
	static class coord {
		int x;
		int y;
		public coord (int x,int y) {
			this.x=x;
			this.y=y;
		}
		
	}
	public static int cost(coord left,coord right,coord top,coord bottom,Pair[] arr) {
		int cost=0;
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i].x;
			int y=arr[i].y;
			int c=arr[i].c;
			//if(x<=right.x && x>=left.x && y<=top.y && y>=bottom.y) {
					//int intersect=0;
					final Polygon polygon=new Polygon();
					polygon.addPoint(right.x, right.y);
					polygon.addPoint(left.x, left.y);
					polygon.addPoint(top.x, top.y);
					polygon.addPoint(bottom.x, bottom.y);
					if(polygon.contains(x,y)) {
						cost+=c;
						
					/*
					if( (y-top.y)-((right.y-top.y)/(right.x-top.x)*(x-top.x)) > 0  ) {
						intersect++;
					}
					if( (y-top.y)-((left.y-top.y)/(left.x-top.x)*(x-top.x)) > 0  ) {
						intersect++;
					}
					if( (y-bottom.y)-((left.y-bottom.y)/(left.x-bottom.x)*(x-bottom.x)) < 0  ) {
						intersect++;
					}
					if( (y-bottom.y)-((right.y-bottom.y)/(right.x-bottom.x)*(x-bottom.x)) < 0  ) {
						intersect++;
					}
					if(intersect>=2) {
						cost+=c;
					} else if(intersect==1) {
						if(x==top.x && y==top.y) {
							cost+=c;
						}else 
						if(x==bottom.x && y==bottom.y) {
							cost+=c;
						}else
						if(x==left.x && y==left.y) {
							cost+=c;
						}else
						if(x==right.x && y==right.y) {
							cost+=c;
						}*/
					//}
					
					
				
			}
		}
		if(cost!=0)
		return cost;
		else
			return Integer.MAX_VALUE;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int w=s.nextInt();
		int h=s.nextInt();
		int d=s.nextInt();
		int n=s.nextInt();
		Pair[] arr = new Pair[n];
		for(int i=0;i<n;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			int c=s.nextInt();
		    Pair pair= new Pair(x, y, c);
		    arr[i]=pair;
		}
		coord left= new coord(0,d);
		coord right= new coord(2*d,d);
		coord top= new coord(d,2*d);
		coord bottom= new coord(d,0);
		int minCost=Integer.MAX_VALUE;
		for(int i=0;i<=w-2*d;i++) {
			for(int j=0;j<=h-2*d;j++) {
				coord templ=new coord(left.x+i,left.y+j);
				coord tempr=new coord(right.x+i,right.y+j);
				coord tempb=new coord(bottom.x+i,bottom.y+j);
				coord tempt=new coord(top.x+i,top.y+j);
				int z=cost(templ,tempr,tempt,tempb, arr);
				if(z<=minCost) {
					minCost=z;
				}
			}
		}
		System.out.println(minCost);
	}

}
