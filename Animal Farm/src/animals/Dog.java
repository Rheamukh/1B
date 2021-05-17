package animals;

public class Dog 
{
	/**
	 * @param breed
	 * @param name
	 * @param color
	 * @param age
	 */
	public Dog(String breed, String name, String color, int age) 
	{
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.age = age;
	}
	private String breed;
	private String name;
	private String color;
	private int age;
	
	public void bark()
	{
		System.out.println("woof");
	}
	
}
