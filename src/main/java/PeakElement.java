public class PeakElement {

    public int[] PeakElement(int[] array) {

        if (array != null && array.length > 0) {

            int peak = 0;
            for (int i = 0; i < array.length; i++)
                if ((i == array.length - 1 || array[i] > array[i + 1]) && (i == 0 || array[i] > array[i - 1])) {
                    peak++;
                }

            int[] peakNum = new int[peak];
            int a = 0;
            for (int i = 0; i < array.length; i++) {
                if ((i == array.length - 1 || array[i] > array[i + 1]) && (i == 0 || array[i] > array[i - 1])) {
                    peakNum[a] = array[i];
                    a += 1;
                }
            }
            return peakNum;
        }
        return new int[]{0};
    }
}
