package lab_3;

/**
 * 
 */
public abstract class Carrier {

	/**
	 * 
	 */
	private String name = "";

	/**
	 * 
	 */
	private Package packageItem;

	/**
	 * 
	 */
	private Sender sender;

	public Sender getSender() {
		return sender;
	}

	/**
	 * @return
	 */
	public abstract Double calcCost();

	public Carrier(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Package getPackageItem() {
		return packageItem;
	}

	/**
	 * @return
	 */
	public void setPackage(Package pkg) {
		packageItem = pkg;
	}

	/**
	 */
	public void setSender(Sender snd) {
		sender = snd;
	}

}