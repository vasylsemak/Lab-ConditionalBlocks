public class SwitchStatement {
	
	public static void main(String[] args) {
		int x = 10;
		
		switch(x) {
		case 8:
			System.out.println("case 8 ran");
		case 10:
			System.out.println("case 10 ran");
		default:
			System.out.println("default case ran");
		}
		
		int y = 5;
		
		switch(y) {
		case 4:
			System.out.println("2nd case 4 ran");
			break;
		case 5:
			System.out.println("2nd case 5 ran");
			break;
		case 6:
			System.out.println("2nd case 6 ran");
			break;
		default:
			System.out.println("2nd default ran");
			break;
		}
	}

}
