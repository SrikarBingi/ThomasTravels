package com.travels;

import java.util.ArrayList;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equals("Car");
	}
	
	public String retriveDriverById(ArrayList<Driver> driversList, int driverId) {
		for(Driver driver : driversList) {
			if(driver.getDriverId()==driverId) {
				return "Driver name is "+driver.getDriverName()+ "Belonging to the category "+driver.getCategory()+ "traveled <\r\n"
						+ "totalDistance> KM so far";
			}
		}
		return "Driver not found";
	}
	
	public int retriveCountOfDriver(ArrayList<Driver> driversList,String category) {
		int count=0;
		for(Driver driver : driversList) {
			if(driver.getCategory().equals(category)){
				count++;
			}
		}
		return count;
	}
	
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> driversList,String category){
		ArrayList<Driver> res = new ArrayList<>();
		for(Driver driver : driversList) {
			if(driver.getCategory().equals(category)) {
				res.add(driver);
			}
		}
		return res;
	}
	
	public Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> driversList){
		double max=0;
		Driver driver=null;
		for(Driver d : driversList) {
			if(max<d.getTotalDistance()) {
				max=d.getTotalDistance();
				driver=d;
			}
		}
		return driver;
	}
}
