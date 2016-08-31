package tests;

import AutomobileInterface.AutoInterface;
import cars.BMW;

public class CarTests {

	public static void main(String[] args) {

		BMW bmw = new BMW();

		System.out.println("BMW wheels: " + bmw.numberofWheels()
				+ " and BMW car seats count: " + bmw.noOfSeats());
		System.out.println("Engine power: " + AutoInterface.POWER);
		
	}

}
