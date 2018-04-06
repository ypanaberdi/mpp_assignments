package lab_3;



import lab_3.Utils.Zones;

public class Package {
	private Zones zone;

	public Package( String description,  double weight, Zones zone) {
		super();
		this.weight = weight;
		this.description = description;
		this.zone = zone;
	}

	/**
	 * 
	 */
	private double weight;

	public double getWeight() {
		return weight;
	}

	/**
	 * 
	 */
	private String description;

	public String getDescription() {
		return description;
	}

	public Zones getZone() {
		return zone;
	}

}