
import java.util.*;

/**
 * 
 */
public interface Carrier extends Carrier {

    /**
     * 
     */
    private String nsame;

    /**
     * 
     */
    private Package package;

    /**
     * 
     */
    private Student sender;



    /**
     * @return
     */
    public Double calcCost();

}