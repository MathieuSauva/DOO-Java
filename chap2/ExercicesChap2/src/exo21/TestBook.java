package exo21;

public class TestBook {
	public static void main(String[] args) {
		// Construct an author instance
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck);  // Author's toString()

		Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);  // Test Book's toString()

		// Test Getters and Setters
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", 
		      new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);  // toString()
		
		Author sauva = new Author("Mathieu Sauva", "mathieu.sauva@etu.univ-amu.fr", 'm');
		System.out.println(sauva);
		
		Book aBook = new Book("Java master", sauva, 20.95, 23);
		
		System.out.println("Author's name is: " + aBook.getAuthorName());
		System.out.println("Author's email is: " + aBook.getAuthorEmail());
		System.out.println("Author's gender is: " + aBook.getAuthorGender());
		
	}

}
