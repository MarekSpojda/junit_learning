package pl.coderslab.testlearning;

import java.text.DecimalFormat;

public class Circle {
    private DecimalFormat decimalFormat = new DecimalFormat("#.###");

    public double circleArea(double r) {
        if (r < 0) {
            throw new NumberFormatException();
        }

        return Double.parseDouble(decimalFormat.format(Math.pow(r, 2) * Math.PI).replace(",", "."));
    }
}
