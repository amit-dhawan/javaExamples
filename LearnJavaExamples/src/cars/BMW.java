package cars;

import AutomobileInterface.AutoInterface;

public class BMW implements AutoInterface{

	@Override
	public int numberofWheels() {
		return POWER;
	}

	@Override
	public int noOfSeats() {
		return 6;
	}

}
