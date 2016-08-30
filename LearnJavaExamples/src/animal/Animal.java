package animal;

abstract public class Animal {

	private String name;

	
	public String getName() {
		return name;
	}

	
	// abstract bark mehtod in Animal class
	abstract void bark();

	// constructor to give animal a name
	Animal(String name) {
		this.name = name;
	}

}
