/**
 * This is class test using JUnit for the helper functions created in Helper.java.
 *
 * @author ASE Lab Group 12
 * Abhee Baboo Hudani 	( 110024036 )
 * Deep Patel 		    ( 110020706 )
 * @version 1.0.0
 */

package com.trigonometric;

import static com.trigonometric.Functions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.trigonometric.exceptions.FactorialException;
import com.trigonometric.exceptions.PowerException;
import org.junit.jupiter.api.Test;

class FunctionsTest {

    static final double decimalValue = 0.0001;

    // Sine Testing
    @Test
    void sineTesting1() throws FactorialException, PowerException {
        assertEquals(
                Math.sin(Math.toRadians(30)),
                sin(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void sineTesting2() throws FactorialException, PowerException {
        assertEquals(Math.sin(3.22), sin(3.22, AngleType.RADIAN), decimalValue);
    }

    @Test
    void sineTesting3() throws FactorialException, PowerException {
        assertEquals(
                Math.sin(Math.toRadians(30)),
                sin(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void sineTesting4() throws FactorialException, PowerException {
        assertEquals(Math.sin(4.8), sin(4.8, AngleType.RADIAN), decimalValue);
    }

    // Cosine Testing
    @Test
    void cosineTesting1() throws FactorialException, PowerException {
        assertEquals(
                Math.cos(Math.toRadians(30)),
                cos(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void cosineTesting2() throws FactorialException, PowerException {
        assertEquals(Math.cos(3.22), cos(3.22, AngleType.RADIAN), decimalValue);
    }

    @Test
    void cosineTesting3() throws FactorialException, PowerException {
        assertEquals(
                Math.cos(Math.toRadians(30)),
                cos(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void cosineTesting4() throws FactorialException, PowerException {
        assertEquals(Math.cos(4), cos(4, AngleType.RADIAN), decimalValue);
    }

    // Tangent Testing
    @Test
    void tangentTesting1() throws FactorialException, PowerException {
        assertEquals(
                Math.tan(Math.toRadians(30)),
                tan(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void tangentTesting2() throws FactorialException, PowerException {
        assertEquals(Math.tan(3.22), tan(3.22, AngleType.RADIAN), decimalValue);
    }

    @Test
    void tangentTesting3() throws FactorialException, PowerException {
        assertEquals(
                Math.tan(Math.toRadians(30)),
                tan(30, AngleType.DEGREE),
                decimalValue
        );
    }

    @Test
    void tangentTesting4() throws FactorialException, PowerException {
        assertEquals(Math.tan(4), tan(4, AngleType.RADIAN), decimalValue);
    }
}
