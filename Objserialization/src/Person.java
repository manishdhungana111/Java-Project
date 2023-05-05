import java.io.Serializable;

public class Person implements Serializable {
    int age = 20;
    String name = " Manish Dhungana ";
    double height = 5.8;
    String getname(){
        return name;
    }
    int getAge(){
        return age;

    }
    double getHeight(){
        return height;
    }

}
