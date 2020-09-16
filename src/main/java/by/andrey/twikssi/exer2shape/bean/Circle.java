package by.andrey.twikssi.exer2shape.bean;

public class Circle extends AbstractShape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        String name ="" + this.getClass();
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
