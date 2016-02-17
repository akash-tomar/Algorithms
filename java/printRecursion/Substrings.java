 package printRecursion;

import java.util.ArrayList;

public class Substrings {

	/**
	 * @param args
	 */
	
	
	public static ArrayList<String> Substring(String str) {
		if(str.length()==0) {
			return new ArrayList<String>();
			
		}
		
		ArrayList<String> subOutput=Substring(str.substring(1));
		long beginIndex=subOutput.size();
		for(int i=0;i<beginIndex;i++) {
			if((subOutput.get(i)).charAt(0)==str.charAt(1)) {
				subOutput.add(str.charAt(0)+subOutput.get(i));
			}
		}
		subOutput.add(str.charAt(0)+"");
		return subOutput;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Substring("ababaca");

	}

}
