import java.io.*;


class Person implements Serializable { String name; String fatherName; int age;
transient double height; transient double weight;

	public Person(String name, String fatherName, int age, double height, double weight) {
		this.name = name;
		this.fatherName = fatherName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String toString() { return "The Person's name is " + name + ", fatherName is "
+ fatherName + ".Person's age is " + age + " ,height is "+ height + ", weight is, "+weight; 
	} 
}
public class Serialisation {
	public static void main(String args[]) {

		try {
			Person unserializedObject = new Person("Bharath kumar","RXE",5,21.5,750000.0);
			System.out.println("Before Serialization");
			System.out.println("unserializedObject: " + unserializedObject);
			FileOutputStream fos = new FileOutputStream("Person_serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(unserializedObject);
			oos.flush();
			oos.close();
		}
		catch(IOException e) {
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		}

		try {
			Person deserializedObject;
			FileInputStream fis = new FileInputStream("Person_serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			deserializedObject = (Person)ois.readObject();
			ois.close();
			System.out.println("\nAfter Serialization transient feilds take defualt values");
			System.out.println("deserializedObject: " + deserializedObject);
		}
		catch(Exception e) {
			System.out.println("Exception during deserialization: " + e);
			System.exit(0);
		}
	}
}

