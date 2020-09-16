package by.andrey.twikssi.exer2shape.bean;

import by.andrey.twikssi.exer2shape.interfaces.Shape;

public class AbstractShape implements Shape {
    private String name;
    private double area;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }
}
