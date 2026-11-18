package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle a;
		a = new Rectangle();
		
		System.out.print("Input the width of the rectangle: ");
		a.width = sc.nextDouble();
		System.out.println("Input the height of the rectangle: ");
		a.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", a.area());
		System.out.printf("PERIMETER = %.2f%n", a.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", a.diagonal());
		
		sc.close();
	}

}
