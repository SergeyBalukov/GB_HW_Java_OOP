package Model;

public class ComplexNumber {

    private final double num1;
    private final double num2;

    public ComplexNumber(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static ComplexNumber add(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.num1 + x2.num1, x1.num2 + x2.num2);
    }

    public static ComplexNumber substract(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.num1 - x2.num1, x1.num2 - x2.num2);
    }

    public static ComplexNumber multiple(ComplexNumber x1, ComplexNumber x2) {
        return new ComplexNumber(x1.num1 * x2.num1 - x1.num2 * x2.num2, x1.num1 * x2.num2 + x1.num2 * x2.num1);

    }

    @Override
    public String toString() {
        String reNum1 = this.num1 + "";
        String reNum2;
        if (this.num2 < 0)
            reNum2 = this.num2 + "i";
        else
            reNum2 = "+" + this.num2 + "i";
        return reNum1 + reNum2;
    }
}

