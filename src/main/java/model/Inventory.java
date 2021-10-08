package model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private static Inventory instance;

	private List<Vehicle> vehicleInventory;

	private Inventory() {
		vehicleInventory = new ArrayList<Vehicle>();
	}

	public static Inventory getInstance() {
		if (instance == null) {
			instance = new Inventory();
		}
		return instance;
	}

	public List<Vehicle> getVehicleInventory() {
		return vehicleInventory;
	}

}
