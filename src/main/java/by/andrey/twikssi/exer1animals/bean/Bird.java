package by.andrey.twikssi.exer1animals.bean;

public class Bird extends Animal{

    @Override
    protected void run() {
        System.out.println("flying");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
