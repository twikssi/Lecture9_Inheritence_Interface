package by.andrey.twikssi.exer2shape.bean;

public class Square extends AbstractShape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        String name ="" + this.getClass();
        return name;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
