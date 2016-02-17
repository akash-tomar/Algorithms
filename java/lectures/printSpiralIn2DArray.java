package lectures;

import java.util.Scanner;

public class printSpiralIn2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		int rows=s.nextInt();
		System.out.println("Enter the no of columns : ");
		int columns=s.nextInt();
		int[][] arr= new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
				{
				arr[i][j]=s.nextInt();
				}
		}
		
		
		int tr=0,br=0,lc=0,rc=0;
		int noe=0;
		int count=1;
		while( noe != rows*columns )
		{
			if(count==1)
			{
				for(int j=tr;j< (arr.length)-rc  ;j++)
				{
					System.out.println(arr[tr][j]);
					noe++;
				}
				
				tr++;
				count++;
				
				
				
			}
			else if(count==2)
			{
				for(int i=tr;i< ( arr.length-br ) ;i++)
				{
					System.out.println( arr[i][ ((arr[i].length )-rc)-1 ] );
					noe++;
				}
				rc++;
				count++;
			}
			else if(count==3)
			{
				for(int j=arr[0].length-rc-1;j>=lc;j--)
				{
					System.out.println(arr[arr.length-br-1][j]);
					noe++;
				}
				br++;
				count++;
			}
			else if(count==4)
			{
				for(int i=arr.length-br-1;i>tr-1;i--)
				{	
					System.out.println(arr[i][lc]);
					noe++;
				}
				
				lc++;
				count=1;
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		//for(int rows=0;rows<arr.length;i++ )
//		{
//			tr++;
//			for(int col=0;col<arr[i].length;j++)
//			{
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
		
		
		
		

	}

}
