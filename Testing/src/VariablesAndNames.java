
public class VariablesAndNames {
	public static void main(String[] args) {
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		cars = 100;             // integer data type
		space_in_a_car = 4.0;   // double data type
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers; // underscore should be provided for giving a space between the words.
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven;
		
		
		System.out.println("There are " + cars + " cars available. ");
		System.out.println("There are only " + drivers + " drivers available.");
		
		System.out.println("There will be " + cars_not_driven + " empty cars today. ");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " +average_passengers_per_car+" in each car.");
		
		// 1. We can use integer value to double but the result will be in double data type itself
		// = (equals) is the assignment operator for assigning the values to the variables
		
		// == (double equals) is for checking the condition
	}

}
