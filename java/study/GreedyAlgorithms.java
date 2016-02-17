package study;

import java.util.ArrayList;
import java.util.HashMap;


class Node {
	public int data;
	public Node left;
	public Node right;
}


public class GreedyAlgorithms {
	public static ArrayList<Integer> activitySelectionRecursive(int[] startingTime,int[] endingTime,int startActivity,int totalNumberOfActivities) {
		int currentActivity=startActivity+1;
		if(startActivity==-1) {

		} else {
			while(currentActivity<totalNumberOfActivities && startingTime[currentActivity]<endingTime[startActivity]) {
				currentActivity++;
			}
		}

		if(currentActivity>=totalNumberOfActivities) {
			ArrayList<Integer> ans=new ArrayList<Integer>();
			return ans;
		}
		ArrayList<Integer> ans=activitySelectionRecursive(startingTime, endingTime, currentActivity, totalNumberOfActivities);
		ans.add(currentActivity);
		return ans;
	}


	public static ArrayList<Integer> activitySelectionIterative(int[] startingTime,int[] endingTime) {
		int starttActivity=0;
		int currentActivity=1;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(0);
		while(currentActivity<startingTime.length) {
			if(startingTime[currentActivity]>=endingTime[starttActivity]) {
				ans.add(currentActivity);
				starttActivity=currentActivity;
			}
			currentActivity++;
		}
		return ans;
	}


	public static int zeroOneKnapSackProblem(int index,int weight,int[] weights,int[] values) {
		if( index < 0 || weight == 0) {
			return 0;
		}
		int a=zeroOneKnapSackProblem(index-1, weight,weights,values);
		int b=zeroOneKnapSackProblem(index-1, weight-weights[index],weights,values);
		return Math.max(a, b);
	}

	public static void fractionalKnapsackProblem(int[] weights,int[] values,int sackWeight) {
		float[] valuePerUnitWeight=new float[weights.length];
		for(int i=0;i<weights.length;i++) {
			valuePerUnitWeight[i]=(float)values[i]/weights[i];
		}
		/*for(int i=0;i<valuePerUnitWeight.length;i++) {
			float min=valuePerUnitWeight[i];
			int index=i;
			for(int j=i;j<valuePerUnitWeight.length;j++) {
				if(valuePerUnitWeight[j]<min) {
					min=valuePerUnitWeight[j];
					index=j;
				}
			}
			float temp=valuePerUnitWeight[i];
			valuePerUnitWeight[i]=min;
			valuePerUnitWeight[index]=temp;
		}*/

	}


	//-------------------------hoffmann coding--------------------------------------

	public static void hoffmanCoding(char[] arr,int[] occurence) {
		HashMap<Integer, Boolean> mapForOccurence=new HashMap<Integer, Boolean>();
		for(int x:occurence) {
			mapForOccurence.put(x, false);
		}
		
		Node root = new Node();
		while(true) {
			int min=occurence[0];
			int index=0;
			for(int i=1;i<occurence.length;i++) {
				if(occurence[i]<min && !mapForOccurence.get(occurence[i])) {
					min=occurence[i];
					mapForOccurence.put(occurence[i], true);
					index=i;
				}
			}
			
		}
	}


	public static void main(String[] args) {
		int[] startTime={1,3,0,5,3,5,6,8,8,2,12};
		int[] endTime={4,5,6,7,9,10,11,12,14,16};
		ArrayList<Integer> ans=activitySelectionIterative(startTime, endTime);
		for(int x:ans) {
			System.out.println(x+" ");
		}

		zeroOneKnapSackProblem(, weight, weights, values);

	}
}
