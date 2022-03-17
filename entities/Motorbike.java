package com.qa.garage_task.entities;

public class Motorbike extends Vehicle {
	
	private int bikething;
	private String bikething2;
	private int bikething3;
	
	public Motorbike(int id, String model, String manufacturer, int bikething, String bikething2, int bikething3) {
	    super(id, model, manufacturer); 
	    this.bikething = bikething;
	    this.bikething2 = bikething2;
	    this.bikething3 = bikething3;

	}

}
