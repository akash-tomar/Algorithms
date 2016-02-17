package Tries;

import java.util.Stack;

public class Trie {
	TrieNode root;
	private int size=0;
	public Trie() {
		root = new TrieNode();
		root.isRoot=true;
	}

	public int size() {
		return size;
	}

	public void addWord(String word) {
		char currentChar=word.charAt(0);
		TrieNode currenNode=root;
		for(int i=0;i<word.length();i++) {
			currentChar=word.charAt(i);
			if(!currenNode.children.containsKey(currentChar)) {
				TrieNode temp=new TrieNode();
				temp.data=currentChar;
				temp.isTerminal=false;
				temp.isRoot=false;
				currenNode.children.put(currentChar,temp );
			}
			currenNode=currenNode.children.get(currentChar);


		}

		if(currenNode.isTerminal) {
			return;
		}
		currenNode.isTerminal=true;
		size++;
	}

	public void deleteWord(String word) {
		if(!isPresent(word))
			return;
		char currentChar;
		TrieNode currenNode=root;
		Stack<TrieNode> stack = new Stack<TrieNode>();
		for(int i=0;i<word.length();i++) {
			currentChar=word.charAt(i);
			stack.push(currenNode);
			currenNode=currenNode.children.get(currentChar);
		}
		currenNode.isTerminal=false;
		size--;

		while(true) {
			if(currenNode.children.size()==0 && !currenNode.isTerminal) {
				if(!stack.empty()) {
					char temp=currenNode.data;
					currenNode=(stack.pop());
					currenNode.children.remove(temp);
				}
			}
			else 
				break;
		}
	}

	public boolean isPresent(String word) {
		if(word.length()==0) {
			return true;
		}
		char currentChar;//=word.charAt(0);
		TrieNode currenNode=root;
		//int i=1;
		//while(i<=word.length()){
		for(int i=0;i<word.length();i++) {
			currentChar=word.charAt(i);
			if(currenNode.children.containsKey(currentChar)) {
				currenNode=currenNode.children.get(currentChar);
				//currentChar=word.charAt(i);
				//i++;
			}
			else {
				return false;
			}
		}
		if(!currenNode.isTerminal) {
			return false;
		}
		return true;
	}

}
