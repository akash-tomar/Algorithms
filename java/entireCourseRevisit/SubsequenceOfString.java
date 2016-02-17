package entireCourseRevisit;

public class SubsequenceOfString {
	
	public static String[] getSubsequences(String str) {
		if(str.length()==1) { 
			String[] temp=new String[2];
			temp[0]="";
			temp[1]=str;
			return temp;
		}
		
		char ch=str.charAt(0);
		String[] out=getSubsequences(str.substring(1));
		String[] output=new String[2*out.length];
		int i;
		for(i=0;i<out.length;i++) {
			output[i]=ch+out[i];
		}
		int j=0;
		for(i=out.length;i<output.length;i++) {
			output[i]=out[j];
			j++;
		}
		return output;
		
	}
	
	public static void printSubsequences(String str,String stringSoFar) {
		if(str.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		
		char ch=str.charAt(0);
		printSubsequences(str.substring(1), stringSoFar.concat(ch+""));
		printSubsequences(str.substring(1), stringSoFar);
		
	}
	
	
	public static void main(String[] args) {
//		String[] output=getSubsequences("aab");
//		for(int i=0;i<output.length;i++)
//			System.out.println(output[i]);
		printSubsequences("abkan", "");
		
	}
	
	
	
	
}
