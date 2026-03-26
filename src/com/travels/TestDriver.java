package com.travels;

import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		
		ArrayList<Driver> drivers = new ArrayList<>();

	    drivers.add(new Driver(1, "Ravi", "Car", 5000));
	    drivers.add(new Driver(2, "Suresh", "Auto", 3000));
	    drivers.add(new Driver(3, "Mahesh", "Car", 7000));
	    drivers.add(new Driver(4, "Naresh", "Lorry", 10000));
	    drivers.add(new Driver(5, "Kiran", "Car", 4500));

	    Travel travel = new Travel();

	    // 1. isCarDriver
	    System.out.println(travel.isCarDriver(drivers.get(0)));

	    // 2. Retrieve by ID
	    System.out.println(travel.retriveDriverById(drivers, 3));

	    // 3. Count by category
	    System.out.println("Car Drivers Count: " +
	            travel.retriveCountOfDriver(drivers, "Car"));

	    // 4. Retrieve drivers by category
	    ArrayList<Driver> carDrivers = travel.retriveDriver(drivers, "Car");
	    System.out.println("Car Drivers:");
	    for (Driver d : carDrivers) {
	        System.out.println(d.getDriverName());
	    }

	    // 5. Max distance driver
	    Driver max = travel.RetriveMaximumDistanceTravelledDriver(drivers);
	    System.out.println("Max Distance Driver: " + max.getDriverName());
	    
	}
}
