
/*
Java program to demonstrate what is transient variable in Java and
the fact that transient variable is not serialized and during the
serialization it initialized with the default value of that data
type, e.g. if transient variable is an Object than after the
deserialization its value would be null.
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
    public static void main(String[] args) {
        Book narnia = new Book(1024, "Narnia", "unknown", 2);

        System.out.println("Before Serialization: " + narnia);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("narnia.ser");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(narnia);

            System.out.println("Book is successfully Serialized!");

            FileInputStream fileInputStream = new FileInputStream("narnia.ser");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Book oldNarnia = (Book) objectInputStream.readObject();

            System.out.println("Book successfully created from Serialized data!");
            System.out.println("Book after Serialization: " + oldNarnia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}