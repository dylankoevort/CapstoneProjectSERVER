package za.ac.cput.util;

/**
 *
 * GenericHelper.java
 * Helper class to generate unique identifier
 * @author Dylan Koevort 218088159
 * 19 July 2021
 *
 */

public class GenericHelper {
    public static String generateRandom() {
        double randNum = Math.random();
        return Long.valueOf(Math.round((randNum * Math.pow(10, 6)))).toString();
    }
}
