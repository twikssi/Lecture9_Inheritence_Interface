package by.andrey.twikssi.exer1animals.bean;

import java.util.Objects;

public class Animal {
    protected String name;

    public void say(){
        System.out.println("screem");
    }

    public void eat (){
        System.out.println("eating");
    }

    public void sleep(){
        System.out.println("sleeping");
    }

    protected void run(){
        System.out.println("going");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
