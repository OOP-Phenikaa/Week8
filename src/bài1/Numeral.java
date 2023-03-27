package bài1;

public class Numeral extends Expression{

      private int value;

      public Numeral(int value) {
            this.value = value;
      }

      public int getValue() {
            return value;
      }

      public void setValue(int value) {
            this.value = value;
      }

      @Override
      public double evaluate() {
            return value;
      }

      @Override
      public String toString() {
            return Double.toString(value);
      }
}
