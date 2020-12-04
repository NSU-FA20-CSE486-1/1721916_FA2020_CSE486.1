package course.cse486.calculator;

public class Calculator {

    public double addition(double input1, double input2) {
        return input1 + input2;
    }

    public double subtraction(double input1, double input2) {
        return input1 - input2;
    }

    public double division(double input1, double input2) {
        return input1 / input2;
    }

    public double multiplication(double input1, double input2) {
        return input1 * input2;
    }

    public double power(double input1, double input2) {
        return Math.pow(input1, input2);
    }
}
