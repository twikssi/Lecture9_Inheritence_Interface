package by.andrey.twikssi.exer3mathoperations.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class AdditionOperationTest {

    @Test
    public void computeReturnSumAandB() {
        AdditionOperation additionOperation = new AdditionOperation();


        assertEquals(20.05,additionOperation.compute(10d,10.05), 0.0001);
    }
}