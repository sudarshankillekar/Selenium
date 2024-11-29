package exceptionHandling;

public class trycatchfinally {

	public static void main(String[] args) {
		
		
		try {
			
			//int arr [] = new int[5];
			int a = 9;
			int b = 2;
			int sum = a+b/100;
			 
		}catch(Exception e){
			System.out.println("fount");
		}
		finally {
			System.out.println("executed ");
		}

	}

}
