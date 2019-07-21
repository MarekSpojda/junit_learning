package pl.coderslab.testlearning;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static List<Integer> generatePrimeFactors(int toDivide) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < (toDivide / 2) + 1; i++) {
            if (toDivide % i == 0) {
                resultList.add(i);
            }
        }

        return resultList;
    }
}
