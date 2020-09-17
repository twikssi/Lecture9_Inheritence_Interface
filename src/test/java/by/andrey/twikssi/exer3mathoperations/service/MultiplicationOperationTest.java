package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationOperationTest {

    @Test
    public void compute() {
        MathOperation mathOperation = new MultiplicationOperation();

        assertEquals(100d,mathOperation.compute(10d,10d), 0.0001);
    }
}