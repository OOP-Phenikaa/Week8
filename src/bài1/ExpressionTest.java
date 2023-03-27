package bài1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression exp = new Power(new Addition(new Subtraction(new Power(new Numeral(10), new Numeral(2)), new Numeral(3)), new Multiplication(new Numeral(4), new Numeral(3))), new Numeral(2));
        try {
            double result = exp.evaluate();
            System.out.println(exp.toString() + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        Numeral ten = new Numeral(10);
        Numeral three = new Numeral(3);
        Numeral four = new Numeral(4);

        Expression tenSquare = new Square(ten);
        Expression threeSubtraction = new Subtraction(tenSquare, three);
        Expression fourMultiply = new Multiplication(four, three);
        Expression expression = new Addition(threeSubtraction, fourMultiply);
        Expression squareExpression = new Square(expression);

        System.out.println(squareExpression.toString()); // ((((10) ^ 2 + -3) + (4 * 3))) ^ 2
        System.out.println(squareExpression.evaluate()); // 49

    }
}
