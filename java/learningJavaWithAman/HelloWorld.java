package learningJavaWithAman;

import java.util.Scanner;

public class HelloWorld {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		System.out.println("1. add");
		System.out.println("2 subtract");
		System.out.println("3 multiply");
		System.out.println("4. divide");
		System.out.println("Enter choice :");
		int c=s.nextInt();
		if(c==1) {
			System.out.println(add(a,b));
		} else if(c==2) {
			String str="akash";
			System.out.println(str.substring(1));
			System.out.println(str.substring(1,6));
					
		}
		String str="akash";
		return;
	}

}
