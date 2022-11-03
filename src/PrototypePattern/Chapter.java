package PrototypePattern;

public class Chapter implements Prototype {
	
	private int number;
	private String name;
	
	public Chapter(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public Prototype createClone() {
		return new Chapter(this.number, this.name);
	}

	public String getChapterDetails() {
		String details = "";
		details = details + "[number : " + number + ", name : " + name + "]";
		return details;
	}
}
