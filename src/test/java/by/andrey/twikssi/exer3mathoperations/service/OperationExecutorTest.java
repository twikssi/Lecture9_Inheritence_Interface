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
        };

        operationExecutor.execute(mathOperations,10,10);
    }
}