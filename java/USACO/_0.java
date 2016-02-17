package USACO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class _0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader f = null;
		try {
			f=new BufferedReader(new FileReader("ride.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			StringTokenizer st=new StringTokenizer(f.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
