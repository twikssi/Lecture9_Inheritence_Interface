package by.andrey.twikssi.exer2shape.bean;

public class Square extends AbstractShape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return (double) side*side;
    }
}
