package PrototypePattern;

import java.util.*;

public class Book implements Prototype {

	private int id;
	private String name;
	private List<Chapter> chapters;

	public Book(int id, String name, List<Chapter> chapters) {
		super();
		this.id = id;
		this.name = name;
		this.chapters = chapters;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}
		
	@Override
	public Prototype createClone() {
	   return new Book(
        this.id,	        
        this.name,
        this.chapters
        	.stream()
	        .map(chapter -> (Chapter) chapter.createClone())
	        .toList());
	}

	public String getBookDetails() {
		String bookDetails = "";
		bookDetails = bookDetails + "[id : " + id + ", name : " + name; 
		if (chapters != null && chapters.size() > 0) {
			List<String> chapterDetails = chapters.stream().map(chapter -> chapter.getChapterDetails()).toList();
			String chapterDetailsString = String.join(", ", chapterDetails);
			bookDetails = bookDetails + ", chapters : {" + chapterDetailsString + "}";
		}
		bookDetails = bookDetails + "]";
		return bookDetails;
	}
}