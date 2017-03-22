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
	
	private void printShape1() {
		
		System.out.println("1. Shape I\n");
		
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
	
	private void printShape2() {
		
		System.out.println("2. Shape II\n");
		
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
	
	private void printShape3() {
		
		System.out.println("3. Shape III\n");
		
		int row = numRow/2+1;
		
	}
	
	private void printShape4() {
		System.out.println("4. Shape IV\n");
		
		for(int i = 0; i < numRow; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}
	
	private void printShape5() {
		System.out.println("5. Shape V\n");
		
		for(int i = 0; i < numRow; i++) {
			for(int j = 0; j < (numRow - i); j++) {
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}
	
}
