package project_utils;

import java.util.Arrays;

public class Utils {

    public static void verifyEquals(String [] expectedResult, String [] actualResult) {

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
