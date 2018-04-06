package lab_3;

/**
 * 
 */
public class UPS extends Carrier {
	private double defaultRate = 0.45;
	/**
     * Default constructor
     */
    public UPS(String name) {
    	super(name);
    }

	@Override
	public Double calcCost() {
		return this.getPackageItem().getWeight()*defaultRate;
	}
 
}