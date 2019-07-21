package pl.coderslab.testlearning;

public class MaxValue {
    public static int largest(int[] list) {
//		int index, max = Integer.MAX_VALUE;

        if (list.length == 0) {
            throw new RuntimeException("Lista jest pusta");
        }

        int index;
        int max = list[0];

        for (index = 0; index < list.length; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }

}
