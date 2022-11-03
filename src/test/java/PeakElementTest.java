import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test(priority = 1)
    public void testArrayReturnsPeakElements_HappyPath() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = {3, 7, 23};

        int[] actualResult = new PeakElement().PeakElement(array);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test(priority = 2)
    public void testPeakElementNegativeValues() {

        int[] array = {-3, 2, -7, 5, 1, -9, 23, 1};

        int[] expectedResult = {2, 5, 23};

        int[] actualResult = new PeakElement().PeakElement(array);

        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test(priority = 3)
    public void testOneElement() {

        int[] array = {2};

        int[] expectedResult = {2};

        int[] actualResult = new PeakElement().PeakElement(array);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
