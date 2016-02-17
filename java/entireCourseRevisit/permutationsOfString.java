package entireCourseRevisit;

public class permutationsOfString {
	public static String[] getPermutations(String str) {
		
		if(str.length()==1) {
			String[] arr=new String[1];
			arr[0]=str;
			return arr;
		}
		
		char ch=str.charAt(0);
		String[] outputSoFar=getPermutations(str.substring(1));
		String[] output=new String[outputSoFar.length*(outputSoFar[0].length()+1)];
		int k=0;
		for(int i=0;i<outputSoFar.length;i++) {
			String currentString=outputSoFar[i];
			int chIndex=0;
			for(int j=0;j<=currentString.length();j++) {
				output[k]=currentString.substring(0,chIndex)+ch+currentString.substring(chIndex,currentString.length());
				k++;
				chIndex++;
			}
		}
		return output;
		
	}
	
	public static void printPermutations(String str,String stringsSoFar[]) {
		if(str.length()==0) {
			for(int i=0;i<stringsSoFar.length;i++)
				System.out.println(stringsSoFar[i]);
			return;
		}
		
		String[] newStringsSoFar=new String[stringsSoFar.length*(stringsSoFar[0].length()+1)];
		int k=0;
		for(int i=0;i<stringsSoFar.length;i++) {
			String currentString=stringsSoFar[i];
			char ch=str.charAt(0);
			for(int chIndex=0;chIndex<=currentString.length();chIndex++) {
				newStringsSoFar[k]=currentString.substring(0,chIndex)+ch+currentString.substring(chIndex,currentString.length());
				k++;
			}
		}
		printPermutations(str.substring(1), newStringsSoFar);
		
	}
	
	
	public static void main(String[] args) {
//		String[] out=getPermutations("aa");
//		for(int i=0;i<out.length;i++)
//			System.out.println(out[i]);
		String[] out=new String[1];
		out[0]="";
		printPermutations("abc", out);
		
	}
}
