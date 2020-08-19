import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("list  1");
		list.add("list  2");
		list.add("list  3");
		list.add("list  4");
		list.add("list  5");
		
		
		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("--------");
		
		ArrayList list1 = new ArrayList();
		for(int i=0; i<5 ; i++) {
			list1.add("list1 "+(i+1));
		}
		
		Iterator it1 = list1.iterator();
		while(it1.hasNext()) {
			Object obj1 = it1.next();
			System.out.println(obj1);
		}
		System.out.println("--------");
		
		LinkedList list2 = new LinkedList();
		for(int i=0; i<5 ; i++) {
			list2.add("list2 "+(i+1));
		}
		
		Iterator it2 = list2.iterator();
		for(int i=0; i<list2.size();i++) {
			//Object obj2 = it2.next();
			Object obj2 = list2.get(i);
			System.out.println(obj2);
		}
		
	} // main
}