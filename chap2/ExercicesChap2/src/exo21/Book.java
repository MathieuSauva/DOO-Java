package exo21;

public class Book {
   // The private instance variables
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   public Book(String name, Author author, double price) {
	      this.name = name;
	      this.author = author;
	      this.price = price;
   }
   
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   /** Returns the name of this book */
   public String getName() {
      return name;
   }
   /** Return the Author instance of this book */
   public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   /** Returns the price */
   public double getPrice() {
      return price;
   }
   /** Sets the price */
   public void setPrice(double price) {
      this.price = price;
   }
   /** Returns the quantity */
   public int getQty() {
      return qty;
   }
   /** Sets the quantity */
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "Book[name="+name+", "+author;  // author.toString()
   }
   
   public String getAuthorName() {
	  return author.getName();  // cannot use author.name as name is private in Author class
   }
   
   public String getAuthorEmail() {
	  return author.getEmail();  
   }
   
   public char getAuthorGender() {
	  return author.getGender();  
   }
}