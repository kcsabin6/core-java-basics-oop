package practice;

public class Dog implements Comparable<Dog> { //  comparable provides default sorting behaviour
	String name;	// 
	int age;
	String color;
	
	/* @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/

	Dog() {
		 
	 }

	 Dog(String name, int age, String color){
	 this.name = name;
	 this.age = age;
	 this.color = color;
	 	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Dog d) {
		
		return this.name.compareToIgnoreCase(d.name);
	}

	/*@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		return this.age-d.age;
	}
	 */

	 
}