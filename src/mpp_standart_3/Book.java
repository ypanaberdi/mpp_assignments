package mpp_standart_3;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorlastName;

	public Book(String isbn, String title, String authorFirstName, String authorlastName) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorlastName = authorlastName;
	}

	@Override
	public boolean equals(Object obj) {
		 
		if (!super.equals(obj))
			return false;

		if (!this.getClass().equals(obj.getClass()))
			return false;

		if (!isbn.equals(((Book) obj).isbn))
			return false;

		if (!title.equals(((Book) obj).title))
			return false;

		if (!authorFirstName.equals(((Book) obj).authorFirstName))
			return false;

		if (!authorlastName.equals(((Book) obj).authorlastName))
			return false;

		return true;
	}
}
