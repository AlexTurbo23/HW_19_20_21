package ua.ithillel.ui.homework21;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String fileName="person.dat";
        Pet pet =new Pet();
        Person person = new Person();
        person.setAge(10);
        person.setName("Tom");
        pet.setName("markiz");
        person.setPet(pet);

        try {
            Seriallzator.serialize(person, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Person personNew = null;
        try {
            personNew = (Person) Seriallzator.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("person Object::"+person);
        System.out.println("personNew Object::"+personNew);
    }
}
