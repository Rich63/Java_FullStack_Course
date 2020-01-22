package org.studyeasy;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.setDoors("closed");
		car.setEngine("on");
		car.setDriver("seated");
		car.setSpeed(0);
		
		System.out.println(car.run());
	}

}
