package bài1;

public class Power extends BinaryExpression{
    public Power(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "^" + right.toString() +")";
    }

    @Override
    public double evaluate() {
        return Math.pow(left.evaluate(), right.evaluate());
    }
}
