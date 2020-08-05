package oops.core.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDog {
public static void main(String[] args) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream("G:/doggy.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("jammy");
		
		objectOutputStream.writeObject(dog1);
		objectOutputStream.writeObject(dog2);
		System.out.println("Dogs are being serialized......");
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOutputStream.close();
}
}