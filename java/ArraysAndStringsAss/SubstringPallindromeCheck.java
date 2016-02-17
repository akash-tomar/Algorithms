package ArraysAndStringsAss;

public class SubstringPallindromeCheck {

	/**
	 * @param args
	 */
	
	
	public static boolean pallindrome(String str,int begin,int end) {
		if(begin>=end) {
			return true;
		}
		
		
		if(str.charAt(begin)!=str.charAt(end)) {
			return false;
		}
		else
			pallindrome(str, begin+1, end-1);
		return true;
	}
	
	
	public static String[] substring(String str) {
		if( str.length()==1 ){
			String[] out=new String[1];
			out[0]=str.charAt(0)+"";
			return out;
		}
		
		char ch=str.charAt(0);
		String subOutput[]=substring(str.substring(1));
		String output[] = new String[2*subOutput.length+5];
		int pos=0;
		for(int i=0;i<subOutput.length;i++) {
			if(subOutput[i]!=null) {
				output[i]=subOutput[i];
				pos=i;
			}
			else 
				break;
			
		}
		pos++;
		for(int i=0;i<subOutput.length;i++) {
			if(subOutput[i]!=null) {
				if( str.charAt(1)==subOutput[i].charAt(0) ) {
					output[pos+i]=ch+""+subOutput[i];
					pos=pos+i;
				}
			}
		}
		pos++;
		output[pos]=ch+"";
		return output;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aba";
		String[] output=substring(str);
//		String check="k";
//		if(pallindrome(check, 0, check.length()-1))
//			System.out.println("yes");
//		else
//			System.out.println("No");
		for(int i=0;i<output.length;i++) {
			
			if(output[i]!=null) {
				if(pallindrome(str, 0, output[i].length()-1))
					System.out.println(output[i]);
			}
		}
		
		
	}

}
