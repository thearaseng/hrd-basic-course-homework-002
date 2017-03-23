package kh.com.kshrd;

public class Shape {
	
	private int numRow;
	
	public Shape(int numRow) { this.numRow = numRow; }
	
	public void printShapes() {
		
		this.printShape1();
		this.printShape2();
		this.printShape3();
		this.printShape4();
		this.printShape5();
		
	}
	
	private void printTitle(String title) {
		System.out.println("\n" + title + "\n");
	}
	
	private void printPyramid(int numRow){
		for(int i = 0; i < numRow; i++) {
			int endIndex = numRow + i;
			for(int j = 0; j < endIndex; j++) {
				if(j >= (numRow - (i + 1)) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}
	
	private void printUpsideDownPyramid(int numRow) {
		int numColumn = (numRow * 2) - 1; 
		for(int i = 0; i < numRow; i++) {
			for(int j = 0; j < numColumn; j++) {
				if( (j >= i) && (j <= (numColumn - (i+1))) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	private void printShape1() {
		printTitle("1. Shape I");
		printPyramid(this.numRow);
	}
	
	private void printShape2() {
		printTitle("2. Shape II");
		printUpsideDownPyramid(this.numRow);
		
	}
	
	private void printShape3() {
		printTitle("3. Shape III");
		int row = (numRow/2)+1;
		System.out.println(row);
	}
	
	private void printShape4() {
		printTitle("4. Shape IV");
		for(int i = 0; i < numRow; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}
	
	private void printShape5() {
		printTitle("5. Shape V");
		for(int i = 0; i < numRow; i++) {
			for(int j = 0; j < (numRow - i); j++) {
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}
	
}
