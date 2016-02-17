package spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class LifeUniverseAndEverything {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			String str = s.next();
			if(str.equals("42")) {
				break;
			} else {
				list.add(str);
			}
		}
		for(String str: list) {
			System.out.println(str);
		}
	}

}
