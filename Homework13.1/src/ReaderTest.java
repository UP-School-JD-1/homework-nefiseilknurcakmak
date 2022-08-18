
public class ReaderTest {
	
	    public static void main(String[] args) {
	    	
	    	Author author1=new Author("Fyodor Dostoevsky");
	    	
	    	Book  book1 = new Book(author1, "Crime and Punishment", 576, BookType.classics, false, 0);
	        
	    	
	       Reader reader1=new Reader("Nefise", 25, 'w');
	        
	        
	    book1.getInfo();
	    reader1.getInfo();
	        reader1.read(book1);
	        book1.setCurrentPage(200);
	        reader1.read(book1);
	        book1.setCurrentPage(576);
	        reader1.read(book1);
	    }}

