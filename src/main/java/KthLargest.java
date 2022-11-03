import java.util.Arrays;

public class KthLargest {

    public int KthLargest(int[] array, int k) {

//        if ( k < array.length && k !=0){
//            return 0;
//        }
        Arrays.sort(array);
        return array[array.length - k];
    }

    // Option # 2
    public int findKthLargestBySorting(int[] arr, int k) {
        Arrays.sort(arr);
        int targetIndex = arr.length - k;
        return arr[targetIndex];
    }
}
