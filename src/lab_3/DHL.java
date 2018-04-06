package lab_3;

/**
 * 
 */
public class DHL extends Carrier {
	Double defaultRate = 0.60;
    /**
     * Default constructor
     */
    public DHL(String name) {
    	super(name);
    }

	@Override
	public Double calcCost() {
		return this.getPackageItem().getWeight()*defaultRate;
	}

}