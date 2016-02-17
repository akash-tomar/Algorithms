package study;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		map.put(1, true);
		map.put(2, true);
		map.put(3, true);
		map.put(4, true);
		map.put(5, true);
		map.remove(3);
		System.out.println(map.get(3));
		
	}

}
