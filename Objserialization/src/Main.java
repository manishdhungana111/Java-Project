import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // FileInputStream fileInputStream = new FileInputStream("Manish.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("Manish.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("Manish.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        person1.getname();
        person1.getAge();
        person1.getHeight();



    }
}