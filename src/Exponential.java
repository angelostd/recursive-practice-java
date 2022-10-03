public class Exponential {

    public Exponential() {
    }

    public double power(int base, int exponent) {
        boolean positive = (exponent >= 0);
        double result = (exponent == 0) ? 1 : base * power(base, Math.abs(exponent) - 1);
        return positive ? result : (1 / result);
    }
}
