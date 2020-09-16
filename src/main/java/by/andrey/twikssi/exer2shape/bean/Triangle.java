package by.andrey.twikssi.exer2shape.bean;

public class Triangle extends AbstractShape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        String name ="" + this.getClass();
        return name;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }
}
