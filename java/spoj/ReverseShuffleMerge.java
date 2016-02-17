package spoj;

import java.util.HashMap;
import java.util.Scanner;

public class ReverseShuffleMerge {
	static String[] perm;
	public static String[] permutations(String str) {
		if( str.length()==2 ) {
			String[] out=new String[2];
			out[0]=str.charAt(0)+""+str.charAt(1);
			out[1]=str.charAt(1)+""+str.charAt(0);
			return out;

		}
		if(str.length()==0) {
			return null;
		}
		char c=str.charAt(0);
		String[] output=permutations(str.substring(1));
		String[] cOutput=new String[output.length*(output[0].length()+1)];
		int k=0;
		for(int i=0;i<output.length;i++) {
			int l=output[i].length()+1;
			int pos=0;
			int count=0; 
			while(count<l) {
				cOutput[k]="";
				int point=0;
				int j;
				for(j=0;j<l;j++) {
					if(pos==j)
						cOutput[k]=cOutput[k].concat(""+c);
					else {
						cOutput[k]=cOutput[k].concat(""+output[i].charAt(point));
						point++;
					}
				}
				pos++;
				k++;
				count++;
			}
		}
		return cOutput;
	}

	public static String getMin() {
		if(perm.length==0) {
			return "";
		}
		String min=perm[0];
		int index=0;
		for(int j=0;j<perm.length;j++) {
			String p=perm[j];
			if(p.length()<min.length()) {
				min=p;
				index=j;
			} else if(p.length()==min.length()) {
				for(int i=0;i<p.length();i++) {
					if(p.charAt(i)<min.charAt(i)) {
						min=p;
						index=j;
						break;
					} else if(p.charAt(i)==min.charAt(i)) {
						continue;
					} else {
						break;
					}
				}
			}
		}
		String[] ans=new String[perm.length-1];
		int k=0;
		for(int i=0;i<perm.length;i++) {
			if(i!=index) {
				ans[k]=perm[i];
				k++;
			}
		}
		perm=ans;
		return min;
	}

	public static boolean isMatchingMerge(String a,String b,String str) {
		String[] matches=combinations(a, b);
		for(String s:matches) {
			if(s.equals(str)) {
				return true;
			}
		}
		return false;
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
		Scanner s =new Scanner(System.in);
		String str=s.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int temp=map.get(str.charAt(i));
				map.replace(str.charAt(i), temp+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		String ans="";

		if(map.containsKey('a')) {
			int val=map.get('a');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("a");
			}
		}  if(map.containsKey('b')) {
			int val=map.get('b');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("b");
			}
		}  if(map.containsKey('c')) {
			int val=map.get('c');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("c");
			}
		}  if(map.containsKey('d')) {
			int val=map.get('d');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("d");
			}
		}  if(map.containsKey('e')) {
			int val=map.get('e');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("e");
			}
		}  if(map.containsKey('f')) {
			int val=map.get('f');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("f");
			}
		}  if(map.containsKey('g')) {
			int val=map.get('g');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("g");
			}
		}  if(map.containsKey('h')) {
			int val=map.get('h');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("h");
			}
		}  if(map.containsKey('i')) {
			int val=map.get('i');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("i");
			}
		}  if(map.containsKey('j')) {
			int val=map.get('j');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("j");
			}
		}  if(map.containsKey('k')) {
			int val=map.get('k');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("k");
			}
		}  if(map.containsKey('l')) {
			int val=map.get('l');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("l");
			}
		}  if(map.containsKey('m')) {
			int val=map.get('m');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("m");
			}
		}  if(map.containsKey('n')) {
			int val=map.get('n');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("n");
			}
		}  if(map.containsKey('o')) {
			int val=map.get('o');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("o");
			}
		}  if(map.containsKey('p')) {
			int val=map.get('p');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("p");
			}
		}  if(map.containsKey('q')) {
			int val=map.get('q');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("q");
			}
		}  if(map.containsKey('r')) {
			int val=map.get('r');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("r");
			}
		}  if(map.containsKey('s')) {
			int val=map.get('s');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("s");
			}
		}  if(map.containsKey('t')) {
			int val=map.get('t');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("t");
			}
		}  if(map.containsKey('u')) {
			int val=map.get('u');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("u");
			}
		}  if(map.containsKey('v')) {
			int val=map.get('v');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("v");
			}
		}  if(map.containsKey('w')) {
			int val=map.get('w');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("w");
			}
		}  if(map.containsKey('x')) {
			int val=map.get('x');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("x");
			}
		}  if(map.containsKey('y')) {
			int val=map.get('y');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("y");
			}
		}  if(map.containsKey('z')) {
			int val=map.get('z');
			val=val/2;
			for(int j=0;j<val;j++) {
				ans=ans.concat("z");
			}
		}

		System.out.println(ans);
		perm=permutations(ans);
		while(true) {
			String p=getMin();
			String rev=new StringBuilder(p).reverse().toString();
			String[] perm_p=permutations(p);
			if(perm_p!=null) {
				for(String per_p:perm_p) {
					if(isMatchingMerge(per_p,rev,str)) {
						System.out.println(p);
						return;
					}
				}
			}
		}


	}

}
