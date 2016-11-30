package bg.elsys.ip.rest;
/**
 * A class that will represent a plane and contains the main characteristics
 * @author Lachezar Ivanov
 * @version 1.0
 */
public class Plane {
	/**
	 * The model of the plane
	 */
	String model;
	/**
	 * The engine model of the plane
	 */
	String engine;
	/**
	 * The number of seats in the plane
	 */
	int seats;
	/**
	 * The maximum weight of the plane
	 */
	int maxWeight;
	/**
	 * The maximum baggage capacity
	 */
	int maxBaggage;
	/**
	 * The top speed of the plane
	 */
	int maxSpeed;

	
	/**
	 * Plane's no parameters constructor
	 */
	public Plane() {
	}

	/**
	 * Constructor for a plane with all the characteristics
	 * @param model the plane model (String)
	 * @param engine the plane engine model (String)
	 * @param seats	the number of seats (int)
	 * @param maxWeight the max weight of the plane in kg (int)
	 * @param maxBaggage the maximum baggage capacity in liters (int)
	 * @param maxSpeed the top speed in km/h (int)
	 */
	public Plane(String model, String engine, int seats, int maxWeight, int maxBaggage, int maxSpeed) {
		super();
		this.model = model;
		this.engine = engine;
		this.seats = seats;
		this.maxWeight = maxWeight;
		this.maxBaggage = maxBaggage;
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Plane model getter
	 * @return the plane model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Plane model setter
	 * @param model the model of the plane
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Engine model getter
	 * @return the plane model
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * Engine model setter
	 * @param engine the model of the plane
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * Number of seats getter
	 * @return the number of seats of the plane
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * Plane number of seats setter
	 * @param seats the number of seats of the plane
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * Maximum weight getter
	 * @return the maximum weight of the plane
	 */
	public int getMaxWeight() {
		return maxWeight;
	}

	/**
	 * Plane model setter
	 * @param maxWeight the max wight in kg
	 */
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	/**
	 * Baggage capacity getter
	 * @return the baggage capacity
	 */
	public int getMaxBaggage() {
		return maxBaggage;
	}

	/**
	 * Max baggage capacity setter
	 * @param maxBaggage the capacity in liters
	 */
	public void setMaxBaggage(int maxBaggage) {
		this.maxBaggage = maxBaggage;
	}

	/**
	 * Top speed getter
	 * @return the plane top speed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Plane top speed setter
	 * @param maxSpeed the top speed
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
