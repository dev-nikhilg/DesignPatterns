package PrototypePattern;

import java.util.*;

public class Application {

public static void main(String[] args) {
		
		// Create chapters list
		List<Chapter> chapters = new ArrayList<>();
		chapters.add(new Chapter(1, "Chapter 1"));
		chapters.add(new Chapter(1, "Chapter 2"));
		
		// Create original book object
		Book b = new Book(1001, "HP Part 1", chapters);
		
		// Print details of the original object
		System.out.println(b);
		System.out.println(b.getBookDetails());
		System.out.println(b.getChapters());
		
		System.out.println("");
		System.out.println("");
		
		// Create a clone using the traditional approach
		// Book clone = createCopyWithTraditionalApproach(b);
		
		// Create a clone using the Prototype pattern
		Book clone = (Book) b.createClone();
		
		// Print details of the clone object
		System.out.println(clone);
		System.out.println(clone.getBookDetails());
		System.out.println(clone.getChapters());
	}
	
	private static Book createCopyWithTraditionalApproach(Book b) {
	  List<Chapter> chapters = new ArrayList<>();
	  for (Chapter c: b.getChapters()) {
	    chapters.add(new Chapter(c.getNumber(), c.getName()));
	  }
	  return new Book(b.getId(), b.getName(), chapters);
	}
}
