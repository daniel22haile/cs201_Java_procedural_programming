package scope.more;

class Bookstore {
	private static final int DEFAULT_NO_OF_EMPLOYEES = 20;
	private static final int DEFAULT_NO_OF_BOOKS = 100;
	private String id;
	private Book[] books;
	private Employee[] employees;

	Bookstore(String theId) {
		id = theId;
		books = new Book[DEFAULT_NO_OF_BOOKS];
		employees = new Employee[DEFAULT_NO_OF_EMPLOYEES];
	}

	int getNumBooks() {
		// implement
		return 0;
	}

	int getNumEmployees() {
		// implement
		return 0;
	}

	public void addNewBook(String bookId) throws Exception {
		int i = 0;
		for (i = 0; i < books.length; i++) {
			if (books != null)
				break;
		}
		if (i == books.length) // the array is full
			throw new Exception("books are full");
		else
			books[i] = new Book(bookId); // add succesfully
	}

	boolean addNewEmployee(String employeeId) {
		Employee e = new Employee(employeeId);

		for (int i = 0; i < employees.length; i++) {

			if (employees[i] == null) {

				employees[i] = e;

				return true;

			}

		}

		return false;

	}

	boolean bookIsInStock(String bookId) {
		// to check the book is in the stock
		for (int i = 0; i < books.length; i++) {

			if (books[i] != null && bookId.equals(books[i].getId()))

				return true;

		}

		return false;
	}
}
