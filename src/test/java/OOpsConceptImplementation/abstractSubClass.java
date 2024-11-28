package OOpsConceptImplementation;

public class abstractSubClass extends abstractClass {

	public static void main(String[] args) {
		
		abstractSubClass abstrac = new abstractSubClass();
		abstrac.practicalDates();
		abstrac.results();
		

	}

	@Override
	public void practicalDates() {
		System.out.println("practical dates will be declared O  12/21/12");
		
	}

}
