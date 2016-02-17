package Tries;

public class TriesUse {
	public static void main(String[] args) {
		Trie t = new Trie();
		t.addWord("akash");
		t.addWord("akansha");
		t.addWord("dog");
		t.addWord("dogs");
		if(t.isPresent("dog"))
			System.out.println("Present"); 
		else
			System.out.println("Not Present");
		System.out.println(t.size());
		t.deleteWord("dogs");
		System.out.println(t.size());
		if(t.isPresent("dogs")) 
			System.out.println("Present");
		else
			System.out.println("No");
		t.deleteWord("akansha");
		System.out.println(t.size());
		if(t.isPresent("akansha"))
			System.out.println("Present");
		else 
			System.out.println("Not");
		if(t.isPresent("akash"))
			System.out.println("PResent");
		else
			System.out.println("Not");
		
	}
}
