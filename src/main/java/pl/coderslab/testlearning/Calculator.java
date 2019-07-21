package pl.coderslab.testlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public boolean greaterAthanB(double a, double b) {
        return a > b;
    }

    @SuppressWarnings("ForLoopReplaceableByForEach")
    public double eval(String operation) {
        char[] charTab = operation.toCharArray();
        List<String> actions = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String inStringBuilder;

        for (int i = 0; i < charTab.length; i++) {
            char myChar = charTab[i];
            if (myChar != '+' && myChar != '-' && myChar != '*' && myChar != '/') {
                stringBuilder.append(myChar);
            } else {
                inStringBuilder = stringBuilder.toString();
                actions.add(inStringBuilder);
                actions.add("" + myChar);
                stringBuilder.setLength(0);
            }
        }

        inStringBuilder = stringBuilder.toString();
        actions.add(inStringBuilder);

        while (actions.contains("*")) {
            int multiplyIndex = actions.indexOf("*");
            String tempResult = "" + (Double.parseDouble(actions.get(multiplyIndex - 1)) * Double.parseDouble(actions.get(multiplyIndex + 1)));
            actions.set((multiplyIndex - 1), tempResult);
            actions.remove(multiplyIndex + 1);
            actions.remove(multiplyIndex);
        }

        while (actions.contains("/")) {
            int divideIndex = actions.indexOf("/");
            String tempResult = "" + (Double.parseDouble(actions.get(divideIndex - 1)) / Double.parseDouble(actions.get(divideIndex + 1)));
            actions.set((divideIndex - 1), tempResult);
            actions.remove(divideIndex + 1);
            actions.remove(divideIndex);
        }

        while (actions.contains("+")) {
            int addIndex = actions.indexOf("+");
            String tempResult = "" + (Double.parseDouble(actions.get(addIndex - 1)) + Double.parseDouble(actions.get(addIndex + 1)));
            actions.set((addIndex - 1), tempResult);
            actions.remove(addIndex + 1);
            actions.remove(addIndex);
        }

        while (actions.contains("-")) {
            int subtractIndex = actions.indexOf("-");
            String tempResult = "" + (Double.parseDouble(actions.get(subtractIndex - 1)) - Double.parseDouble(actions.get(subtractIndex + 1)));
            actions.set((subtractIndex - 1), tempResult);
            actions.remove(subtractIndex + 1);
            actions.remove(subtractIndex);
        }

        return Double.parseDouble(actions.get(0));
    }
}
