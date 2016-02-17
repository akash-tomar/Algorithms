package hashing;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon;

import BinaryTree.BinaryTreeNode;
import BinaryTree.BinaryTreeUse;
import BinaryTree.QueueEmptyException;
import BinaryTree.QueueusingLL;


public class MapUse {

	public static void printIntersection(int[] first, int[] second) {

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i =0; i < first.length; i++) {
			map.put(first[i], true);
		}

		for (int i =0; i < second.length; i++) {
			if (map.containsKey(second[i])) {
				System.out.println(second[i]);
			}
		}
	}

	public static void printCount(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i =0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], count + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		for (int i =0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				System.out.println(array[i] + " " + map.get(array[i]));
				map.remove(array[i]);
			}
		}
	}

	public static ArrayList<Integer> intersectionOfTwoArrays(int[] first ,int[] second)  {
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int i=0;i<first.length;i++) {
			map.put(first[i], true);
		}
		for(int i=0;i<second.length;i++) {
			if(map.containsKey(second[i])) {
				list.add(second[i]);
			}
		}
		return list;	
	}


	public static ArrayList<Integer> removeDuplicates(int[] arr){
		HashMap<Integer, Boolean> map= new HashMap<Integer, Boolean>();
		ArrayList<Integer> list= new ArrayList<Integer>();
		map.put(arr[0], true);
		list.add(arr[0]);
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], true);
				list.add(arr[i]);
			}

		}
		return list;
	}

	public static void arrayElementsSumToZero(int[] arr) {
		HashMap<Integer, Boolean> map= new HashMap<Integer, Boolean>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				if(map.get(arr[i])==null) {
					map.put(arr[i], true);
				}
			}
		}

		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(map.get(Math.abs(arr[i]))!=null) {
					if(map.get(Math.abs(arr[i]))) {
						System.out.println((-1)*arr[i]+" -"+(-1)*arr[i]);
					}
				}
			}
		}
	}


	public static void extractUniqueCharFromstring(String str) {
		HashMap<Character, Boolean> map=new HashMap<Character, Boolean>();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i), true);
				System.out.print(str.charAt(i)+" ");
			}

		}
	}

	public static int retNumWithMaxFreq(int[] arr) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int max=Integer.MIN_VALUE;
		int maxCount=0;
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], 1);
				if(maxCount<1) {
					maxCount=1;
					max=arr[i];
				}
			} else {
				int count=map.get(arr[i]);
				count++;
				map.remove(arr[i]);
				map.put(arr[i], count);
				if(maxCount<count) {
					maxCount=count;
					max=arr[i];
				}
			}
		}
		return max;		
	}



	public static void pairSumSInBST(BinaryTreeNode<Integer> root,int sum) {
		if(root==null) {
			return;
		}
		QueueusingLL<BinaryTreeNode<Integer>> queue = new QueueusingLL<BinaryTreeNode<Integer>>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> temp;
			try {
				temp=queue.dequeue();
			} catch (QueueEmptyException e) {
				return;
			}

			if(map.get(temp.data)!=null) {
				System.out.println(temp.data+" "+(sum-temp.data));
				map.remove(temp.data);
			}
			else {
				map.put((sum-temp.data), true);
			}

			if(root.left!=null)
				queue.enqueue(root.left);
			if(root.right!=null)
				queue.enqueue(root.right);
			if(queue.isEmpty()) {
				return;
			}
		}
	}


	public static void main(String args[]) {

		//		Map m = new Map();
		//		m.put("abc", "def");
		//		m.put("def", "ghi");
		//		m.put("ghi","jkl");
		//		m.put("ghsci", "abdbd");
		//		m.put("fecaa", "abaaaadbd");
		//		m.put("fjasbjasec", "abdnsjasjlnxbd");
		//		System.out.println(m.get("abc"));
		//		System.out.println(m.get("def"));
		//		System.out.println(m.get("ghi"));
		//		System.out.println(m.get("ghsci"));
		//		System.out.println(m.get("fecaa"));
		//		System.out.println(m.get("fjasbjasec"));
		//		System.out.println(m.size());

		//		m.put("mno", "pqr");
		//		m.put("rst", "uvw");
		//		System.out.println(m.get("mno"));
		//		System.out.println(m.get("rst"));
		//		System.out.println(m.get("uvw"));
		//		System.out.println(m.remove("def"));
		//		System.out.println(m.get("def"));
		//		ArrayList<String> keys=m.getKeys();
		//		ArrayList<String> values=m.getValues();
		//		for(int i=0;i<keys.size();i++) {
		//			System.out.print(keys.get(i)+" ");
		//		}
		//		for(int i=0;i<values.size();i++) {
		//			System.out.print(values.get(i)+" ");
		//		}
		//		



		//		System.out.println(m.get("abc"));
		//		System.out.println("abcff".hashCode() + " " + "abcd".hashCode() + " " + "ghi".hashCode() + " "
		//				+ "ghiydgugugfgifh".hashCode());
		//		m.put("ghi", "xyz");
		//		System.out.println(m.get("abc"));
		//		
		//		m.put("abcd", "dgey");
		//		m.put("ghiydgugugfgifh", "xyz");
		//		
		//		
		//		int[] input = {1,2,3,4,1,2,1,3,4};
		//		printCount(input);
		//		int[] first={1,2,3,4,5,6,7,8,9};
		//		int[] second={2,4,7,9,10,13,16};
		//		ArrayList<Integer> list=intersectionOfTwoArrays(first, second);
		//		for(int i=0;i<list.size();i++) {
		//			System.out.println(list.get(i));
		//		}
		//		int[] arr={1,2,3,4,-1,-3,-5,8,-9};
		//		arrayElementsSumToZero(arr);
		//		ArrayList<Integer> lists=removeDuplicates(arr);
		//		for(int i=0;i<lists.size();i++) {
		//			System.out.println(lists.get(i));
		//		extractUniqueCharFromstring("akash");
//		int[] preOrder={1,2,4,7,5,3,6};
//		int[] inOrder={7,4,2,5,1,3,6};
		BinaryTreeNode<Integer> root = BinaryTreeUse.getBinaryTreeInput();
		BinaryTreeUse.printBinaryTree(root);
		pairSumSInBST(root, 3);
		
		
//		int[] arr={1,2,3,4,5,6,2,3,4,5,3,4,5,3,4,2,1,3};
//		System.out.println(retNumWithMaxFreq(arr));


	}










}

