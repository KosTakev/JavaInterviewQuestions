import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Shoe whiteNikeShoe =
                new Shoe("Nike", 1000, 9, "WHITE", true);

        System.out.println("Before Serialization");
        whiteNikeShoe.print();

        //serializing shoe object
        writeShoe(whiteNikeShoe);

        //creating another shoe with different brand
        Shoe blackAdidasShoe = new Shoe(
                "Adidas", 2000, 8, "BLACK", true);

        //deserializing shoe object
        whiteNikeShoe = (Shoe) readShoe();

        System.out.println("After Deserialization");
        whiteNikeShoe.print();
    }


    private static void writeShoe(Serializable shoe) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(new File("shoe.ser")));

        objectOutputStream.writeObject(shoe);
        objectOutputStream.close();

    }
    private static Object readShoe() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(new File("shoe.ser")));

        Object object = objectInputStream.readObject();
        return object;
    }
}
