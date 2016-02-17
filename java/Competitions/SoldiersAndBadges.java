package Competitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SoldiersAndBadges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		HashMap<Integer, Boolean> map= new HashMap<Integer, Boolean>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int temp=s.nextInt();
			if(map.containsKey(temp)) {
				list.add(temp);
			}
			else {
				map.put(temp, true);
			}
		}
		int coins=0;
		while(!list.isEmpty()) {
			int pop=list.remove(0);
			int beginIndex=pop+1;
			while(true) {
				if(!map.containsKey(beginIndex)) {
					map.put(beginIndex, true);
					coins+=(beginIndex-pop);
					break;
				} else {
					beginIndex++;
					continue;
				}
			}
		}
		System.out.println(coins);
	}

}
