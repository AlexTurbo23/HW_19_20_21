package ua.ithillel.ui.homework21;

import java.io.Serializable;

public class Pet implements Serializable {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public Pet() {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Pet{name="+name+"}";
    }
}
