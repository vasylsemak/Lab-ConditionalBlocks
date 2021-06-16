
public class ConditionalBlocks {

	public static void main(String[] args) {
		boolean b = true;
		b = false;
		
		
		if(b) {
			System.out.println("Inside the if-statement after reasignment to false");
		} else {
			System.out.println("Inside the else-statement after reasignment to false");
		}
		System.out.println("Outside of the if-statement");
		
	    boolean firstCondition = false;
	    boolean secondCondition = true;
	    
	    System.out.println("-----------------------------------------------------------------");
	    
	    if(firstCondition) {
	    	System.out.println("Inside the if-statement");
	    	
	    	if(secondCondition) {
	    		System.out.println("Inside the nested if-statement");
	    	}
	    } else {
	    	System.out.println("Inside inside the else-statement");
	    }
	    System.out.println("Outisde of the second if-statement");
	}

}
