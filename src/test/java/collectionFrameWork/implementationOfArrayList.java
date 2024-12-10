package collectionFrameWork;

import java.util.ArrayList;
//ArrayList can maintain insertion order
//ArrayList implements list interface
//ArrayList can hold duplicate value
//ArrayList can have Null value's
//ArrayList can be randomy accessed
    public class implementationOfArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<String> a  = new ArrayList<>();
		//test
		a.add("sudarshan");
		a.add("sudarshan");
		a.add("sindhu");
		a.add("mom");
		a.add("dad");	
		a.add(5, "vaibhav");
        System.out.println(a.get(0));
		a.remove(0);
		System.out.println(a);
	}
	
	//test
	
	 
	
	
	
}
