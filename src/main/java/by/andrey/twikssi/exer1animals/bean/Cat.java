package by.andrey.twikssi.exer1animals.bean;

public class Cat extends Mammal{

    @Override
    public void say() {
        System.out.println(name + "miu miu");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
