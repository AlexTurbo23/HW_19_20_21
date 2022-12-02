package ua.ithillel.ui.homework21;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Pet pet;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Person() {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
    @Override
    public String toString(){
        return "Person{name="+name+",age="+age+",pet="+pet+"}";
    }
}