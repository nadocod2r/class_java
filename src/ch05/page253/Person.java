package ch05.page253;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name + "\n" 
				+ "나이 : " + this.age + "\n" 
				+ "신장 : " + this.height + "\n" 
				+ "체중 : " + this.weight + "\n";
	}
}
