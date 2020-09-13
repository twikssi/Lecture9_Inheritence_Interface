package by.andrey.twikssi.exer1animals.bean;

public class Dog extends Mammal{

    @Override
    public void say() {
        System.out.println(name + "bark bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat meat and vegetable");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
