package extracredit1;

public class Book extends Aitem{
	private String ISBN;
	 
	public Book(String iSBN, int limit) {
		super(limit);
		ISBN = iSBN;
		 
	}
}
