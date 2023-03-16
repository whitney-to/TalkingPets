package io.zipcoder.polymorphism;

public abstract class Pet implements Animal{
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
