package pl.coderslab.testlearning;

public class SimpleSample {
    @SuppressWarnings("ConstantConditions")
    boolean shouldBeTrue() {
        return 4 <= 5;
    }

    int returnNum() {
        return 2;
    }

    int returnNum2() {
        return 2;
    }

    double return2dot223() {
        return 2.223d;
    }

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(message);
        }
    }
}
