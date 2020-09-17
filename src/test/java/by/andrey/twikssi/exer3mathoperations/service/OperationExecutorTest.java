package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    @Test
    public void execute() {
        OperationExecutor operationExecutor = new OperationExecutor();
        MathOperation[] mathOperations = {
                new MultiplicationOperation(),
                new SubtractionOperation(),
                new AdditionOperation(),
                new DivisionOperation(),
        };

        operationExecutor.execute(mathOperations,10,10);

        assertEquals(100d, mathOperations[0].compute(10d,10d),0.001);
        assertEquals(0d, mathOperations[1].compute(10d,10d),0.001);
        assertEquals(20d, mathOperations[2].compute(10d,10d),0.001);
        assertEquals(1d, mathOperations[3].compute(10d,10d),0.001);
    }
}