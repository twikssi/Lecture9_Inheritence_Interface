package by.andrey.twikssi.exer2shape.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class TriangleTest {
    public static Logger logger = LoggerFactory.getLogger("Common logger");

    @Test
    public void ShapeDemo(){
        AbstractShape[] abstractShapes = new AbstractShape[]{
                new Circle(10),
                new Square(10),
                new Triangle(10,12),
        };

        for (AbstractShape shape: abstractShapes) {
            logger.info("Name shape is " + shape.getName());
            logger.info("Its Area is " + shape.getArea());
        }

        assertEquals(314.159,abstractShapes[0].getArea(),0.001);
        assertEquals(100.0,abstractShapes[1].getArea(),0.001);
        assertEquals(60.0,abstractShapes[2].getArea(),0.001);
    }

}