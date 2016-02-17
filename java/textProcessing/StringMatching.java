package textProcessing;

public class StringMatching {
	public static int bruteForceMatch(String str1,String str2) {
		for(int i=0;i<str1.length();i++) {
			for(int pos=0;pos<str1.length()-str2.length()+1;pos++) {
				if(str1.substring(pos,pos+str2.length()).equals(str2)) {
					return pos;
				}
			}
		}
		return -1;
	}
	
	
	
	public static int editDistance(String str1,String str2) {
		int[][] dpArray=new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<=str1.length();i++) {
			dpArray[i][0]=i;
		}
		for(int j=0;j<=str2.length();j++) {
			dpArray[0][j]=j;
		}
		//int dist=0;
		for(int i=1;i<=str1.length();i++) {
			for(int j=1;j<=str2.length();j++) {
				if(str1.charAt(str1.length()-i)==str2.charAt(str2.length()-j)) {
					dpArray[i][j]=dpArray[i-1][j-1];
				} else {
					dpArray[i][j]=1+Math.min( dpArray[i-1][j-1], Math.min( dpArray[i][j-1], dpArray[i-1][j]) );
				}
			}
		}
		return dpArray[str1.length()][str2.length()];
	}
	
	
	
	
	public static void main(String[] args) {
		String str1="abcde";
		String str2="cbad";
		System.out.println(editDistance(str1, str2));
		
	}
	
	
}
