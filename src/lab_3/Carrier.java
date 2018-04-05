package lab_3;


import java.util.*;

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
    private ArrayList<Package> packages;

    /**
     * 
     */
    private Sender sender;




    /**
     * @return
     */
    public abstract Double calcCost();

    public Carrier(String name) {
		super();
		this.name = name;
		this.packages = new ArrayList<Package>();
	}

	/**
     * @return
     */
    public boolean addPackage(Package pkg){
    	return packages.add(pkg);
    }

    /**
     */
    public void setSender(Sender snd){
    	sender = snd;
    }

}