import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test(priority = 1)
    public void testKthLargest_HappyPath() {

        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        int actualResult = new KthLargest().KthLargest(array, k);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
