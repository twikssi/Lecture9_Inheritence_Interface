package by.andrey.twikssi.exer1animals.bean;

public class Parrot extends Bird{

    @Override
    public void eat() {
        System.out.println("eat corn");
    }

    @Override
    public void say() {
        System.out.println(name + "reapeat human`s words");
    }
}
