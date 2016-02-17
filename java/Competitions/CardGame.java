package Competitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CardGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int p1Cards=s.nextInt();
		
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		for(int i=0;i<p1Cards;i++) {
			p1.add(s.nextInt());
		}
		int p2Cards=s.nextInt();
		for(int i=0;i<p2Cards;i++) {
			p2.add(s.nextInt());
		}
		int count=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(true) {
			if(p1.size()==0) {
				System.out.println(count+" 2");
				return;
			}
			if(p2.size()==0) {
				System.out.println(count+" 1");
				return;
			}
			if(map.containsKey(p1.get(0)) && map.get(p1.get(0))==p2.get(0)) {
				System.out.println("-1");
				return;
			}

			map.put(p1.get(0), p2.get(0));
			if(p1.get(0)>p2.get(0)) {
				int temp1=p1.get(0);
				int temp2=p2.get(0);
				p1.remove(0);
				p2.remove(0);
				p1.add(temp2);
				p1.add(temp1);
				count++;
			} else if(p2.get(0)>p1.get(0)) {
				int temp1=p1.get(0);
				int temp2=p2.get(0);
				p1.remove(0);
				p2.remove(0);
				p2.add(temp1);
				p2.add(temp2);
				count++;
			}


		}
	}
}


