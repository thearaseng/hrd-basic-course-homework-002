package kh.com.kshrd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork {
	
	public static void main(String[] args) {
		System.out.print("Input number of row : ");
		try{
			new Shape(new Scanner(System.in).nextInt()).printShapes();
		}catch(InputMismatchException e) {
			System.err.println("There're some errors. Please try again!");
		}
	}
	
}
