/**
 * This is class test using JUnit for the trigonometric functions created in Functions.java.
 *
 * @author ASE Lab Group 12
 * Abhee Baboo Hudani 	( 110024036 )
 * Deep Patel 		    ( 110020706 )
 * @version 1.0.0
 */

package com.trigonometric;

import static com.trigonometric.Helper.factorial;
import static com.trigonometric.Helper.power;
import static org.junit.jupiter.api.Assertions.*;

import com.trigonometric.exceptions.FactorialException;
import com.trigonometric.exceptions.PowerException;
import org.junit.jupiter.api.Test;

class HelperTest {

    static final double decimalValue = 0.0001;

    @Test
    void powerTesting() throws PowerException {
        assertEquals(Math.pow(2, 7), power(2, 7));
    }

    @Test
    void factorialTesting() throws FactorialException {
        assertEquals(40320, factorial(8));
    }

    @Test
    void convertDegreeToRadianTesting() {
        assertEquals(
                Math.toRadians(45),
                Helper.convertDegreeToRadian(45),
                decimalValue
        );
    }
}
