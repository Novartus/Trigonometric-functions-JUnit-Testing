/**
 * This is for calculating helper functions such as power, factorial, degree to radian converter, normalization of radiant.
 *
 * @author ASE Lab Group 12
 * Abhee Baboo Hudani 	( 110024036 )
 * Deep Patel 		    ( 110020706 )
 * @version 1.0.0
 */
package com.trigonometric;

import com.trigonometric.exceptions.FactorialException;
import com.trigonometric.exceptions.PowerException;

public class Helper {

    public static double PI = 3.14159265359;
    public static double Angle = 360;

    /**
     * It will return value of PI
     * @return will return the value of PI
     */
    public static double getPI() {
        return PI;
    }

    /**
     * It will return value of Angle
     * @return will return the value of Angle
     */
    public static double getAngle() {
        return Angle;
    }

    /**
     * It will convert Degree to Radian
     * @param base will be used as input of base value
     * @param exponent will be used as input of exponent value
     * @return will return the power of base with given exponent
     */
    public static double power(double base, int exponent) throws PowerException {
        double powerValue = 1;
        if (exponent < 0) {
            throw new PowerException(
                    "Exponent value must be greater than or equals to zero"
            );
        }
        if (exponent == 0) {
            return powerValue;
        }
        for (int i = 0; i < exponent; i++) {
            powerValue = powerValue * base;
        }
        return powerValue;
    }

    /**
     * It will convert Degree to Radian
     * @param val will be used as input
     * @return will return the factorial value of val
     */
    public static long factorial(int val) throws FactorialException {
        if (val < 0) {
            throw new FactorialException(
                    "Number should be greater than or equals to zero"
            );
        } else {
            if (val <= 2) {
                return val;
            }
            return val * factorial(val - 1);
        }
    }

    /**
     * It will convert Degree to Radian
     * @param degree will be used as degree input
     * @return will return radian value of degree
     */
    public static double convertDegreeToRadian(double degree) {
        return 2 * degree * getPI() / getAngle();
    }

    /**
     * It will convert Degree to Radian
     * @param radian will be used as radian input
     * @return will return normalized radian value
     */
    public static double normalizeRadian(double radian) {
        return radian % (getPI() * 2); // Convert radian to an angle between -2 PI and 2 PI
    }
}
