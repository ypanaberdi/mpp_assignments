package lab_3;


/**
 * 
 */
public abstract class Sender implements SenderI {
	
	/**
	 * Default constructor
	 */
	public Sender() {
	}

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	public double discount = 0.0;

	/**
	 * @return
	 */
	public double calcDiscount() {
		
		return 0.0d;
	}

}