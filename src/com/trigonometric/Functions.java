/**
 * This project is for calculating trigonometric functions such as sin, cos, and tan using taylor series.
 *
 * @author ASE Lab Group 12
 * Abhee Baboo Hudani 	( 110024036 )
 * Deep Patel 		    ( 110020706 )
 * @version 1.0.0
 */
package com.trigonometric;

import static com.trigonometric.Helper.*;

import com.trigonometric.exceptions.FactorialException;
import com.trigonometric.exceptions.PowerException;

/**
 * The logical reference was taken from https://www.efunda.com/math/miscellaneousfun/miscellaneousfun.cfm
 */

public class Functions {

    /**
     * Trigonometry sine function
     * @param angle will be used as input of angle
     * @param angleType will be enum that will be used to determine type of angle (Degree, Radian)
     * @return will return the sine value of given angle
     */
    public static double sin(double angle, AngleType angleType)
            throws FactorialException, PowerException {
        if (angleType == AngleType.DEGREE) {
            angle = convertDegreeToRadian(angle);
        }
        double sin = 0;
        double normAngle = normalizeRadian(angle);
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sin += power(normAngle, 2 * i + 1) / factorial(2 * i + 1);
            } else {
                sin -= power(normAngle, 2 * i + 1) / factorial(2 * i + 1);
            }
        }
        return sin;
    }

    /**
     * Trigonometry cosine function
     * @param angle will be used as input of angle
     * @param angleType will be enum that will be used to determine type of angle (Degree, Radian)
     * @return will return the cosine value of given angle
     */
    public static double cos(double angle, AngleType angleType)
            throws FactorialException, PowerException {
        if (angleType == AngleType.DEGREE) {
            angle = convertDegreeToRadian(angle);
        }
        double cos = 1.0;
        double normAngle = normalizeRadian(angle);

        for (int i = 1; i <= 11; i++) {
            if (i % 2 == 0) {
                cos += power(normAngle, 2 * i) / factorial(2 * i);
            } else {
                cos -= power(normAngle, 2 * i) / factorial(2 * i);
            }
        }
        return cos;
    }

    /**
     * Trigonometry tangent function
     * @param angle will be used as input of angle
     * @param angleType will be enum that will be used to determine type of angle (Degree, Radian)
     * @return will return the tangent value of given angle
     */
    public static double tan(double angle, AngleType angleType)
            throws FactorialException, PowerException {
        return sin(angle, angleType) / cos(angle, angleType);
    }

    public enum AngleType {
        DEGREE,
        RADIAN,
    }
}
