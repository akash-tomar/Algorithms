package heap;
import java.util.ArrayList;

public class MinPriorityQueue<T> {
	private ArrayList<HeapPair<T>> heap;
	
	public MinPriorityQueue() {
		heap= new ArrayList<HeapPair<T>>();
		heap.add(null);
	}
	
	public int size() {
		return heap.size()-1;
	}
	
	public boolean isEmpty() {
		if(size()==0) 
			return true;
		return false;
	}
	
	public T min() throws HeapEmptyException{
		if(size()==0) {
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		return heap.get(1).value;
	}
	
	public void insert(T value,int priority) {
		HeapPair<T> pair = new HeapPair<T>();
		pair.priority=priority;
		pair.value=value;
		heap.add(pair);
		int childIndex=size();
		int parentIndex=childIndex/2;
		while(childIndex>1) {
			if(heap.get(parentIndex).priority>heap.get(childIndex).priority) {
				HeapPair<T> swap = heap.get(parentIndex);
				heap.set(parentIndex, pair);
				heap.set(childIndex, swap);
			}
			else {
				break;
			}
			childIndex=parentIndex;
			parentIndex=childIndex/2;
		}
	}
	
	public T removeMin() {
		HeapPair<T> min = heap.get(1);
		heap.set(1, heap.get(size()));
		heap.remove(size());
		int currentIndex=1;
		int firstChildIndex=2*currentIndex;
		int secondChildIndex=2*currentIndex + 1;
		while(firstChildIndex<=size()) {
			int parent=currentIndex;
			int firstChild=firstChildIndex;
			int secondChild=-1;
			if(secondChildIndex<=size()) {
				secondChild=secondChildIndex;
			}
			HeapPair<T> toBeSwapped=null;
			int toBeSwappedindex=-1;
			if(heap.get(parent).priority>heap.get(firstChild).priority) {
				toBeSwapped=heap.get(firstChild);
				toBeSwappedindex=firstChild;
			}
			if(secondChild!=-1 && heap.get(parent).priority>heap.get(secondChild).priority 
			&& heap.get(secondChild).priority<heap.get(firstChild).priority) {
				toBeSwapped=heap.get(secondChild);
				toBeSwappedindex=secondChild;
			}
			if(toBeSwapped!=null) {
				HeapPair<T> temp=heap.get(parent);
				heap.set(parent, toBeSwapped);
				heap.set(toBeSwappedindex, temp);
			}
			else
				break;
			currentIndex=toBeSwappedindex;
			firstChildIndex=currentIndex*2;
			secondChildIndex=currentIndex*2 + 1;
			
		}
		return min.value;
	}
	
}
