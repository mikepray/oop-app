package app;

import model.Inventory;
import model.Sedan;
import model.TransmissionEnum;
import model.Vehicle;

/**
 * This app is a hypothetical mechanic's inventory. Pretend that the mechanic
 * has an inventory for both land vehicles and boats. Running the app should
 * list the current items in the inventory and pretty-print their properties
 */
public class MechanicInventoryApplication {

	// TODO add an Engine class to Vehicle and print it. (encapsulation)
	// TODO add a Truck as an extension of Vehicle. Trucks should have a bed length. Print the bed length for trucks (absraction/inheritance/polymorphism/encapsulation)
	// TODO add Boats to the inventory (inheritance/encapsulation/abstraction) and create a few boats in the inventory
	// TODO figure out how to print an AmphibiousVehicle (polymorphism)
	public static void main(String[] args) {
		buildMockInventory();
		System.out.println("Vehicles:");
		for (Vehicle vehicle : Inventory.getInstance().getVehicleInventory()) {
			System.out.println(vehicle.getName());
			System.out.println("Transmission: " + vehicle.getTransmission());
			System.out.println("Number of Doors: " + vehicle.getNumDoors());
			System.out.println("Engine: ?");
		}
	}

	private static void buildMockInventory() {
		Sedan mazda3 = new Sedan() {
			@Override
			public String getName() {
				return "Mazda3";
			}

			@Override
			public TransmissionEnum getTransmission() {
				return TransmissionEnum.AUTOMATIC;
			}
		};

		Inventory.getInstance().getVehicleInventory().add(mazda3);
	}

}
