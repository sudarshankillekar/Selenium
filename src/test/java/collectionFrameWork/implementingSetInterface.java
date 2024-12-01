package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

//set does not contains duplicate element
//set does not maintain insertion order
//set does not contains null value
//hastset treeset linkedhastset implement set interface
public class implementingSetInterface {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		set.add("rahul");
		set.add("sudarshan");
		set.add("killekar");
		set.add("gopal");
		set.remove("killekar");
		System.out.println(set);
		System.out.println(set.size());
   
	Iterator<String> it =	  set.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
		
	}

}
