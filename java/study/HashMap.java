package study;

public class HashMap<T,V> {
	private int size;
	private PairNode<T,V>[] bucket;


	public HashMap() {
		size=0;
		bucket = new PairNode[3];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}

	public void put(T key,V value) {
		PairNode<T,V> temp = new PairNode<T, V>();
		temp.key=key;
		temp.value=value;
		int h = key.hashCode() % bucket.length;
		temp.next=bucket[h];
		bucket[h]=temp;
		if( (1.0*size())/(1.0*bucket.length) > 0.6) {
			reHash();
		}
	}

	private void reHash() {
		PairNode<T,V>[] tempBucket=bucket;
		bucket = new PairNode[bucket.length*2];
		size=0;
		for(int i=0;i<tempBucket.length;i++) {
			PairNode temp = tempBucket[i];
			while(temp!=null) {
				put((T)temp.key, (V)temp.value);
				temp=temp.next;
			}
		}
	}


	public V get(T key) {
		int h = key.hashCode() % bucket.length;
		PairNode<T,V> temp = bucket[h];
		while(temp.key.equals(key)) {   
			temp=temp.next;
		}
		return (V)temp.value;
	}

	public void remove(T key) {
		int h = key.hashCode() % bucket.length;
		PairNode<T,V> temp=bucket[h];
		PairNode<T,V> prev=null;
		while(temp.key!=key) {
			prev=temp;
			temp=temp.next;
		}
		
		
		if(prev!=null) {
			prev.next=temp.next;
		} else {
			bucket[h]=bucket[h].next;
		}
	}

}



















