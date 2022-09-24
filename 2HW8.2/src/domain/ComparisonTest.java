package domain;
import java.util.Comparator;
import java.util.function.BinaryOperator;
public class ComparisonTest {
	   public static void main(String[] args) {
	        Book book1 = new Book("Effective Java", "Joshua", "Bloch", 717);
	        Book book2 = new Book("Design Patterns", "Eric", "Gamma", 450);
	        Book book3 = new Book("Refactoring", "Martin", "Fowler", 982);


	        Comparator<Book> comparatorByPageNumber = (b1, b2) -> b1.getPages() - b2.getPages();

	        BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);

	        System.out.println("\n Comparing the number of pages of the book  "+  book1.getTitle() +" with "+ book1.getPages() + " pages  and  the book that  " + book2.getTitle() +" with "+ book2.getPages() + " pages.");
	        System.out.println("\n The book with " + maxPageNumberOperator.apply(book1, book2).getPages() + " pages is longer.");
	        System.out.println("\n Comparing the number of pages of the book  "+  book2.getTitle() +" with "+ book2.getPages() + " pages  and  the book that  " + book3.getTitle() +" with "+ book3.getPages() + " pages.");
	        System.out.println("\n The book with " + maxPageNumberOperator.apply(book2, book3).getPages()+ " pages is longer.");
	    }
	}
