package lab_3;


/**
 * 
 */
public class USmail extends Carrier {
	private double rate = 0.55;
	private double defaultRate = 1;

	public USmail(String name) {
		super(name);
	}

	@Override
	public Double calcCost() {
		if (this.getPackageItem().getWeight() > 3)
			return this.getPackageItem().getWeight() * rate;
		else
			return defaultRate*getPackageItem().getWeight();
	}

}