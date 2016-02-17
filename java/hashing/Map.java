package hashing;

import java.util.ArrayList;

public class Map {
	private int size;
	private PairNode[] bucket = new PairNode[3];
	public int size() {
		return size;
	}
	public Map() {
		// TODO Auto-generated constructor stub
		size=0;
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}

	public String get(String key) {
		int h=(key.hashCode())%bucket.length;
		PairNode temp=bucket[h];
		while(temp!=null) {
			if(temp.pair.key==key)
				break;
			else if(temp.pair.key!=key) 
				temp=temp.next;
		}
		if(temp==null)
			return null;
		return temp.pair.value;
	}

	public void reHash() {
		PairNode[] tempBucket=bucket;
		bucket=new PairNode[2*bucket.length];
		size=0;
		for(int i=0;i<tempBucket.length;i++) {
			PairNode temp=tempBucket[i];
			while(temp!=null) {
				put(temp.pair.key, temp.pair.value);
			}
		}
	}
	
	public void put(String key,String value) {
		int h=(key.hashCode())%bucket.length;
		PairNode temp = new PairNode();
		temp.pair.key=key;
		temp.pair.value=value;
		temp.next=bucket[h];
		bucket[h]=temp;
		size++;
		if((1.0*size())/(1.0*bucket.length)>0.6) {
			reHash();
		}
		
		
		
	}

	public String remove(String key) {
		int h=(key.hashCode())%bucket.length;
		PairNode temp=bucket[h];
		PairNode prev=null;
		while(temp!=null) {
			if(temp.pair.key!=key) {
				prev=temp;
				temp=temp.next;
			}
			else 
				break;
		}
		if(temp==null) {
			return null;
		}
		
		if(prev==null) {
			String val=bucket[h].pair.value;
			bucket[h]=bucket[h].next;
			size--;
			return val;
		}
		
		prev.next=temp.next;
		size--;
		return temp.pair.value;
		
		
	}

	public ArrayList<String> getKeys() {
		ArrayList<String> keys=new ArrayList<String>();
		for(int i=0;i<size();i++) {
			PairNode temp=bucket[i];
			while(temp!=null) {
				keys.add(temp.pair.key);
				temp=temp.next;
			}
		}
		return keys;
	}

	public ArrayList<String> getValues() {
		ArrayList<String> values = new ArrayList<String>();
		for(int i=0;i<size();i++) {
			PairNode temp=bucket[i];
			while(temp!=null) {
				values.add(temp.pair.value);
				temp=temp.next;
			}
		}
		return values;
	}


}
