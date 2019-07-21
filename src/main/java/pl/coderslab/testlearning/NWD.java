package pl.coderslab.testlearning;

public class NWD {
    public int nwd(int a, int b) {
        int helpInt;
        while (a % b != 0) {
            helpInt = a % b;
            a = b;
            b = helpInt;
        }

        return b;
    }
}
