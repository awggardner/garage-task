package com.qa.garage_task;
import java.util.ArrayList;

import com.qa.garage_task.entities.Vehicle;


public class Garage {
	
	private static int counter = 1;
	private ArrayList<Vehicle> vehicles;
	private int id;
	private String model;
	
	public static void main(String[] args) {
		
	}
	public ArrayList<Vehicle> getVehicles() {
		System.out.println(vehicles);
		return vehicles;
		
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
    public Garage(int id, ArrayList<Vehicle> vehicles, String model) {
        this.setId(Garage.counter);
        this.model = model;
        this.vehicles = vehicles;
        Garage.counter++;
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Garage() {
        this.vehicles = new ArrayList<>();
    }
	
    
    public void addVehicle(Vehicle vehicle) {
        vehicle.add(vehicle);
    }
    
    public void removeVehicle(Vehicle vehicle) {
    	getClass(vehicle)
    	if (vehicle instanceof Class.Car) {
        vehicle.remove(vehicle);
    	}
    	return vehicle;
    }
    
    public void printVehicles() {
        for (Vehicle vehicles : vehicles) {
            System.out.println(vehicles);
        }
    }


    
}
