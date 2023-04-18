package entities;

public class People {

	String name;
	int age;
	Double width;
	char gender;

	public People(String name, int age, Double auxHeigth) {
		super();
		this.name = name;
		this.age = age;
		width = auxHeigth;
	}

	public People(String name, Double auxHeigth, char gender) {
		this.name = name;
		width = auxHeigth;
		this.gender = gender;
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Double getWidth() {
		return width;
	}

	public char getGender() {
		return this.gender;
	}

}
