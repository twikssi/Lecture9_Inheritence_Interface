package by.andrey.twikssi.exer3mathoperations.service;

import by.andrey.twikssi.exer3mathoperations.interfaces.MathOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {
    Logger logger = LoggerFactory.getLogger(OperationExecutor.class);

   public void execute(MathOperation[] operations, double a, double b){
       for (MathOperation mathoperation: operations) {
           String text = "Math operation is " + mathoperation.getNameClass() + " " + mathoperation.compute(a,b);
           logger.info(text);
       }
    }
}
