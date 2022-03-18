package com.qa.garage_task;
import java.util.ArrayList;
import java.util.List;
import com.qa.garage_task.entities.*;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		// create array list to store information about vehicles in garage
		// create vehicles to put in garage
		Vehicle car1 = new Car(0, "zoom", 0, 0, 0);
		Vehicle motorbike1 = new Motorbike(1, "bike", 15, 0, 0);
		Vehicle van1 = new Van(2, "whiteVan", 0, 0, 0, 0);
		Vehicle van2 = new Van(3, "vanVan", 30, 0, 0, 0);
		//put vehicles in garage
		garage.vehicles.add(car1);
		garage.vehicles.add(motorbike1);
		garage.vehicles.add(van1);
		garage.vehicles.add(van2);
		
		//remove vehicle by ID
		garage.removeVehicleById(1);
		
		//check if it's still there - don't think it should still be there
		garage.getVehicleById(1);
		
		System.out.println(garage.vehicles.toString());
		

	}

}
