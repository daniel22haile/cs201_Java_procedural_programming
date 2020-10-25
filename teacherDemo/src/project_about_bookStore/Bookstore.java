package project_about_bookStore;

public class Bookstore {
	private static final int DEFAULT_NO_OF_EMPLOYEES = 20;

	private static final int DEFAULT_NO_OF_BOOKS = 100;

	private String id;

	private Book[] books;

	private Employee[] employees;

//double []array=new double [3];

	public Bookstore(String theId) {

		id = theId;

		books = new Book[DEFAULT_NO_OF_BOOKS];// length of the books is 100

		employees = new Employee[DEFAULT_NO_OF_EMPLOYEES];// length of employees is 20

	}

	public int getNumBooks() {// this one is not work may be if incase after we add book if deleted we use
								// count method

		int count = 0;

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null)

				count++;

		}

		return count;

	}

	public int getNumEmployees() {

		int count = 0;

		for (int i = 0; i < employees.length; i++) {

			if (employees[i] != null)

				count++;

		}

		return count;

	}

	public boolean addNewBook(String bookId) {

//int i=0;

		Book b = new Book(bookId);

		for (int i = 0; i < books.length; i++) {

			if (books[i] == null) {

				books[i] = b;

				return true;

			}

		}

		return false;

//   for( int i=0;i<books.length;i++) {

//    if(books[i]==null) {

//    books[i]=new Book(bookId);

//        return true;

//      }   //break;

//    } 

//   //if(i>=0&&i<books.length)

//   //return true;

//   return false;

	}

	public boolean addNewEmployee(String employeeId) {

		Employee e = new Employee(employeeId);

//int i=0;

//for(i=0;i<employees.length;i++) {

//if(employees[i]==null);

//break;

//}

//employees[i]=e;

//if(i>=0&&i<employees.length)

//return true;

//return false;

		for (int i = 0; i < employees.length; i++) {

			if (employees[i] == null) {

				employees[i] = e;

				return true;

			}

		}

		return false;

	}

	public boolean bookIsInStock(String bookId) {

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null && bookId.equals(books[i].getId()))

				return true;

		}

		return false;

//for(int i=0;i<getNumBooks();i++) {

//if(books[i]!=null && bookId.equals(books[i].getId()))

//return true;

//       } 

// return false;

	}

	public static void main(String[] args) {

		Bookstore bs = new Bookstore("234");

		bs.addNewBook("101");

		bs.addNewBook("102");

		bs.addNewBook("103");

		bs.addNewBook("104");

		bs.addNewBook("105");

		bs.addNewBook("106");

		bs.addNewBook("106");
		bs.addNewEmployee("Danny");

		System.out.println(bs.getNumBooks());
		System.out.println(bs.getNumEmployees());

		System.out.println(bs.bookIsInStock("103"));

	}

}