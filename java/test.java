import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class test {
	public static char alphabets(int c) {
		c=c%26;
		if(c==0)
			return ' ';
		else if(c==1)
			return 'a';
		else if(c==2)
			return 'b';
		else if(c==3)
			return 'c';
		else if(c==4)
			return 'd';
		else if(c==5)
			return 'e';
		else if(c==6)
			return 'f';
		else if(c==7)
			return 'g';
		else if(c==8)
			return 'h';
		else if(c==9)
			return 'i';
		else if(c==10)
			return 'j';
		else if(c==11)
			return 'k';
		else if(c==12)
			return 'l';
		else if(c==13)
			return 'm';
		else if(c==14)
			return 'n';
		else if(c==15)
			return 'o';
		else if(c==16)
			return 'p';
		else if(c==17)
			return 'q';
		else if(c==18)
			return 'r';
		else if(c==19)
			return 's';
		else if(c==20)
			return 't';
		else if(c==21)
			return 'u';
		else if(c==22)
			return 'v';
		else if(c==23)
			return 'w';
		else if(c==24)
			return 'x';
		else if(c==25)
			return 'y';
		else if(c==26)
			return 'z';
		else 
			return ' ';
	}
	public static String[] combinations(String a,String b) {
		System.out.println("here");
		if(a.length()==0 && b.length()!=0) {
			String[] ans=new String[1];
			ans[0]=b;
			return ans;
		}
		if(b.length()==0 && a.length()!=0) {
			String[] ans=new String[1];
			ans[0]=a;
			return ans;
		}
		if(a.length()==0 && b.length()==0) {
			return null;
		}
		String[] out1=combinations(a.substring(1), b);
		for(String o:out1) {
			o=a.charAt(0)+o;
		}
		String[] out2=combinations(a, b.substring(1));
		for(String o:out2) {
			o=b.charAt(0)+o;
		}
		String[] ans=new String[out1.length+out2.length];
		int x=0;
		int y=0;
		for(int i=0;i<ans.length;i++) {
			if(x<out1.length) {
				ans[i]=out1[x];
				x++;
			}
			else if(y<out2.length) {
				ans[i]=out2[y];
				y++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		/*String str="__....----__...------_..._.--_.....----__----_..._.----__.------_..._...__";			
		float count=0;
		String ans="";
		//for(float k=15;k<=30;k+=0.5) {
		//	for(float j=15;j<=30;j+=0.5) {
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='_') {
						//count+=24;
						ans=ans+alphabets(27-(int)(count))+" ";
						count=0;
					}else 
						if(str.charAt(i)=='.') {
							count+=4;
						} else 
							if(str.charAt(i)=='-') {
								count+=0.5;
							}
				}
				System.out.println(ans);
				ans="";
				count=0;
			}*/
		/*int[] arr={1,2,3};
		HashMap<Integer, int[]> map=new HashMap<Integer, int[]>();
		map.put(1, arr);
		for(int x: map.get(1)) {
			System.out.println(x);
		}*/
		/*String str="11111";*/
		//System.out.println("0"+str+"0");
//		Queue<Integer> q = new LinkedList<Integer>();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		while(!q.isEmpty())
//			System.out.println(q.remove());
		/*HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		map.put('a', 1);
		System.out.println(map.get('a'));*/
		/*String[] a=combinations("a", "b");
		for(String ans:a) {
			System.out.println(ans);
		}*/

		String stks="abababab";
		System.out.println(stks.subSequence(0, 5));
		
		


		//}
		//}
	}
}