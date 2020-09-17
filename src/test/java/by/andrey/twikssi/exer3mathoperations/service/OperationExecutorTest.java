package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OperationExecutorTest {

    @Mock
    DivisionOperation divisionOperation;

    @InjectMocks
    OperationExecutor operationExecutor;

    @Before
    public void setUp(){
        when(divisionOperation.)
    }

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