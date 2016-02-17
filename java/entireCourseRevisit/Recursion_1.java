package entireCourseRevisit;

public class Recursion_1 {

	public static int multiplyTwoNos(int a,int b,int times) {
		if(times==b)
			return 0;
		return(a+multiplyTwoNos(a, b, times+1));
	}
	public static float sumGP(int k,int count) {
		if(count>k) {
			return 0;
		}
		return  (float) (1/(Math.pow(2,count))+sumGP(k, count+1));
	}

	public static boolean isPallindrome(String str,int beginIndex,int endIndex) {
		if(endIndex-beginIndex==0 || endIndex-beginIndex==1) {
			if(str.charAt(beginIndex)==str.charAt(endIndex))
				return true;
			return false;
		}
		if(str.charAt(beginIndex)==str.charAt(endIndex)) {
			return isPallindrome(str, beginIndex+1, endIndex-1);
		}
		return false;
	}

	public static String replacePie(String str) {
		if(str.length()==0)
			return "";
		if(str.charAt(0)!='p') {
			return str.charAt(0)+replacePie(str.substring(1));
		}
		if(str.length()>=2)
			if(str.charAt(1)=='i') {
				return "3.14"+replacePie(str.substring(2));
			}
		return 'p'+replacePie(str.substring(1));
	}
	
	public static String removeX(String str) {
		if(str.length()==0) {
			return "";
		}
		if(str.charAt(0)=='x')
			return removeX(str.substring(1));
		return str.charAt(0)+removeX(str.substring(1));
	}
	
	public static int stringToInt(String str) {
		if(str.length()==0)
			return 0;
		
		int num=(int)Math.pow(10, str.length()-1);
		num=(str.charAt(0)-'0')*num;
		return num+stringToInt(str.substring(1));
		
	}
	
	public static int sumOfIntInString(String str) {
		if(str.length()==1) {
			return (str.charAt(0)-'0');
		}
		int num=(int)Math.pow(10, str.length()-1);
		num=(Integer.parseInt(str)/num);
		return num+sumOfIntInString(str.substring(1));
	}
	
	public static boolean areTwoStringsPallindrome(String str1,String str2) {
		if(str1.length()==0)
			if(str2.length()!=0)
				return false;
		if(str2.length()==0)
			if(str1.length()!=0)
				return false;
		if(str1.length()==0 && str2.length()==0)
			return true;
		
		if(str1.charAt(0)==str2.charAt(str2.length()-1))
			return areTwoStringsPallindrome(str1.substring(1), str2.substring(0,str2.length()-1));
		return false;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyTwoNos(10, 50,0));
		System.out.println(sumGP(3, 0));
		System.out.println(isPallindrome("akakaa", 0, 5));
		System.out.println(replacePie("pixppiababappip"));
		System.out.println(removeX("xa"));
		System.out.println(stringToInt("12456"));
		System.out.println(sumOfIntInString("1256"));
		System.out.println(areTwoStringsPallindrome("ab", "ba"));
	}

}
