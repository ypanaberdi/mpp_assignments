package mpp_standart_3;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord cr;

	public CheckoutRecord getCheckoutRecord() {
		return cr;
	}

	public void setCheckoutRecord(CheckoutRecord cr) {
		this.cr = cr;
	}

	public LibraryMember(String memberId, String firstName, String lastName, String phone) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

}
