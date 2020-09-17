package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;

public class AdditionOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a+b;
    }

    @Override
    public String getNameClass() {
        return "Addition";
    }
}
