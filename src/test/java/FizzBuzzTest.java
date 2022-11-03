import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class FizzBuzzTest {

    /**
     * Positive Testing  Happy Path
     * if (start <= end)
     * return array
     */


    @Test(priority = 1)
    public void testStartLessThanEnd_HappyPath() {

        //AAA
        //Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //  Option # 1
        //  FizzBuzz fb = new FizzBuzz();
        //  String [] actualResult = fb.FizzBuzz(start,end);


        //Act
        String[] actualResult = new FizzBuzz().FizzBuzz(start, end);

        // Assert
        // Assert.assertEquals(actualResult, expectedResult);
        project_utils.Utils.verifyEquals(actualResult, expectedResult);
    }


    /**
     * start == end
     */

    @Test(priority = 2)
    public void testStartEqualsEnd_HappyPath() {

        //AAA
        //Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        // OLd Version
        // FizzBuzz fb = new FizzBuzz();
        // String [] actualResult = fb.FizzBuzz(start,end);

        //Act
        String[] actualResult = new FizzBuzz().FizzBuzz(start, end);

        //Assert
        //  Assert.assertEquals(actualResult, expectedResult);
        project_utils.Utils.verifyEquals(actualResult, expectedResult);
    }

    /**
     * start < end
     */


    @Test(priority = 3)
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        //AAA
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        //act
        String[] actualResult = new FizzBuzz().FizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * 2. Negative testing
     * if (start > end)
     * return new String[0];
     */


    @Test(priority = 4)
    public void testStartGreaterThanEnd_Negative() {
        //AAA
        //arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().FizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
