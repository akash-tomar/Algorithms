package recursion_ass;

public class NumberOfPermutationsGreaterThanInput {
	
	
	public static int permutationsGreaterThanInput(String str) {
		int count=0;
		int number=0;
		int pos=str.length()-1;
		for(int i=0;i<str.length();i++) {
			number+=(str.charAt(i)-'0')*Math.pow(10,pos );
			pos++;
		}
		String[] permu=permutations(str);
		for(int i=0;i<permu.length;i++) {
			int num=0;
			int index=0;
			for(int j=permu[i].length();j>=0;j--) {
				num+=(permu[i].charAt(j)-'0')*Math.pow(10,index );
				index++;
			}
			if(num>number)
				count++;
		}
		return count;
	}
	
	
	
	public static String[] permutations(String str) {
		if(str.length()==2) {
			String[] temp=new String[2];
			temp[0]=str;
			temp[1]=str.charAt(1)+"";
			temp[1]=temp[1].concat(str.charAt(0)+"");
//			System.out.println(temp[0]);
//			System.out.println(temp[1]);
			return temp;			
		}
		char ch=str.charAt(0);
		String[] outputSoFar=permutations(str.substring(1));
		String[] output=new String[outputSoFar.length*(1+outputSoFar[0].length())];
		int count=0;
		while(count<outputSoFar.length) {
			int index=0;
			for(int i=0;i<=(outputSoFar[count].length()+1);i++) {
				if(i==index) {
					output[i]=output[i].concat(ch+"");
				}
				else {
					output[i]=output[i].concat(outputSoFar[count].charAt(i)+"");
				}
				index++;
			}
			
			
			count++;
		}
		return output;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(permutationsGreaterThanInput("123"));
	}
}
