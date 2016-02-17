package lectures;

import java.util.Scanner;

public class Fibonnaci {

	/**
	 * @param args
	 */
//	void fibonnaci(int n)
//	{
//		if()
//	}
//	
	
	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
	    //int fibo[1000];
	    //fibo[0]=0;
	    //fibo[1]=1;
		int a=0;
		int b=1;
	    System.out.print(a+ " " + b + " ");
	    //int z=2;
	    while(true)
	    {
	    	int fib=a+b;
	    	if(fib<=n)
	    	{
	    		System.out.print(fib+" ");
	    		a=b;
	    		b=fib;
	    		//z++;
	    	}
	    	else
	    	{
	    		break;
	    	}
	    }
	    
		
	}

}
