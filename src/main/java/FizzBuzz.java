public class FizzBuzz {

    public String[] FizzBuzz(int start, int end) {


        if (start <= end) {
            String[] array = new String[end - start + 1];// put our new values of FizzBuzz // the length of the array [end - start + 1]

            // int number = start;
            for (int i = 0; i < array.length && start < -end; i++) {   // number
                if (start % 15 == 0) {
                    array[i] = "FizzBuzz";
                } else if (start % 3 == 0) {
                    array[i] = "Fizz";
                } else if (start % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(start);
                }
                start++;                                               // number
            }
            return array;
        }

        return new String[0];
    }
}
