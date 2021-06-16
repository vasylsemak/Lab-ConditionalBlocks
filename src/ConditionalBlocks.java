
public class ConditionalBlocks {

	public static void main(String[] args) {
		boolean b = false;
		
		if(b) {
			System.out.println("Inside if statement");
		}
		System.out.println("Outside if statement");
		
		b = false;
		
		if(b) {
			System.out.println("Inside if statement after reasignment to false");
		}
		System.out.println("Outside if statement after reasignment to false");

	}

}
