package oops.core.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDog {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("G:/doggy.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Dog dog1 = (Dog)ois.readObject();
			Dog dog2 = (Dog)ois.readObject();
			System.out.println(dog1);
			System.out.println(dog2);
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}
