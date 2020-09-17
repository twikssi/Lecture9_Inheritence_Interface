package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionOperationTest {

    @Test
    public void compute() {
        MathOperation mathOperation = new SubtractionOperation();

        assertEquals(10d,mathOperation.compute(20d,10d), 0.0001);
    }
}