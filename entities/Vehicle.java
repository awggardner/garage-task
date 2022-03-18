package com.qa.garage_task.entities;

public abstract class Vehicle {
	
	private int id;
	private String model;
	private String manufacturer;
	
	public Vehicle() {
		this(0, "Unkown", "Unkown");
	}
	public Vehicle(String model, String manufacturer) {
		this(0, model, manufacturer);
	}

	public Vehicle(int id, String model, String manufacturer) {
		super();
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public abstract void add(Vehicle vehicle);
	public abstract void remove(Vehicle vehicle);
	
	 @Override    public String toString() {
	        return "Vehicle [id=" + id + ", model=" + model + ", manufacturer=" + manufacturer + "]";
	    }
}
