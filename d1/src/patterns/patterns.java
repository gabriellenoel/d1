package patterns;

public class patterns {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// pattern one
		int i, x, y, row=4;
		System.out.println("1)");
		for (i=1; i<=row; i++) {
			for (x=0; x<i; x++) {
				System.out.print("*");
			} System.out.println("");
		} 
		System.out.println(".........");
		
		
		// pattern two
		System.out.println("2");
		System.out.println("..........");
		row=1;
		for (i=4; i>=row; i--) {
			for (x=0; x<i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		// pattern three
		System.out.println("3)");
		row=1;
		for (i=4; i>=row; i--) {
			for (x=0; x<i; x++) {
				System.out.print(" ");
			}
			for (y = 1 + 2*(4-i); y>0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("...........");
		System.out.println("");
		
		//pattern four
		System.out.println("4)");
		System.out.println("............");
		row=4;
		for (i=1;i<=row;i++) {
			for (x=0; x<i;x++) {
				System.out.print(" ");
			}
			for (y = 7 - 2*(i-1); y>0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
}

