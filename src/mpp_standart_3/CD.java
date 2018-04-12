package mpp_standart_3;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;

	public CD(String productId, String title, String company) {
		super();
		this.productId = productId;
		this.title = title;
		this.company = company;
	}

	@Override
	public boolean equals(Object obj) {
		 
		if (!super.equals(obj))
			return false;

		if (!this.getClass().equals(obj.getClass()))
			return false;

		if (!productId.equals(((CD) obj).productId))
			return false;
		
		if (!title.equals(((CD) obj).title))
			return false;
		
		if (!company.equals(((CD) obj).company))
			return false;

		return true;
	}

}
