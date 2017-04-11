package edu.bcas.circle;

public class Main {

	public static void main(String[] args) {

		Circlearea carea=new Circlearea(3.14,5);
		carea.findArea();
		carea.findDiameter();
		
		System.out.println("...........................");
		Square square=new Square(5);
		square.findArea();
		square.findDiameter();
	}

}
