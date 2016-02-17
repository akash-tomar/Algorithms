package spoj;

public class Boxing { 
	public static int maxCredit(int[] a,int[] b,int[] c,int[] d,int[] e) {
		int pa=0,pb=0,pc=0,pd=0,pe=0;
		int credits=0;

		while(true) {
			boolean isa=false,isb=false,isc=false,isd=false,ise=false;
			int temp=0;
			while(true) {
				int p=Integer.MAX_VALUE,q=Integer.MAX_VALUE,r=Integer.MAX_VALUE,s=Integer.MAX_VALUE,t=Integer.MAX_VALUE;
				if(pa<a.length) {
					p=a[pa];
				}
				if(pb<b.length) {
					q=b[pb];
				}
				if(pc<c.length) {
					r=c[pc];
				}
				if(pd<d.length) {
					s=d[pd];
				}
				if(pe<e.length) {
					t=e[pe];
				}
				int min=Math.min(p, Math.min(q, Math.min(r, Math.min(s, t))));
				
				
				if(pa<a.length) {
					while(a[pa]<=min) {
						pa++;
						if(!isa) {
							temp++;
						}
						isa=true;
						if(pa>=a.length) {
							break;
						}
					}
				}
				if(pb<b.length) {
					while(b[pb]<=min) {
						pb++;
						if(!isb) {
							temp++;
						}
						isb=true;
						if(pb>=b.length) {
							break;
						}
					}
				}
				if(pc<c.length) {
					while(c[pc]<=min) {
						pc++;
						if(!isc) {
							temp++;
						}
						isc=true;
						if(pc>=c.length) {
							break;
						}
					}
				}
				if(pd<d.length) {
					while(d[pd]<=min) {
						pd++;
						if(!isd) {
							temp++;
						}
						isd=true;
						if(pd>=d.length) {
							break;
						}
					}
				}
				if(pe<e.length) {
					while(e[pe]<=min) {
						pe++;
						if(!ise) {
							temp++;
						}
						ise=true;
						if(pe>=e.length) {
							break;
						}
					}
				}

				if(temp>=3) {
					credits++;
					break;
				} 
			}
			int count=0;
			if(pa>=a.length) {
				count++;
			}
			if(pb>=b.length) {
				count++;
			}
			if(pc>=c.length) {
				count++;
			}
			if(pd>=d.length) {
				count++;
			}
			if(pe>=e.length) {
				count++;
			}
			if(count>=3) {
				break;
			}
		}
		return credits;

	}
	public static void main(String[] args) {
		int[] a={100,200,300,1200,6000};
		int[] b={};
		int[] c={900,902,1200,4000,5000,6001};
		int[] d={0,2000,6002};
		int[] e={1,2,3,4,5,6,7,8};
		System.out.println(maxCredit(a, b, c, d, e));
	}
}
