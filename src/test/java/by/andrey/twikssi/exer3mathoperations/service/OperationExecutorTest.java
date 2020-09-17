package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class OperationExecutorTest {

    @Mock


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