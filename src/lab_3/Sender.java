package lab_3;

import java.util.*;

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
	public Double discount;

	/**
	 * @return
	 */
	public double calcDiscount() {
		// TODO implement here
		return 0.0d;
	}

}