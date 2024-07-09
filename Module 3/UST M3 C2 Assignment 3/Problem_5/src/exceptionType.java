
import java.util.*;
class CheckedExceptionExample {
    public void divideException() {
        int numerator = 7;
        int denominator = 0;
        try {
            int answer = divide(numerator, denominator);
            System.out.println("Checked Result: " + answer);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Cannot divide a value by zero.");
        }
    }

    public  int divide(int value, int factor) throws ArithmeticException {
        if (factor == 0) {
            throw new ArithmeticException("Cannot divide a value by zero");
        }
        return value / factor;
    }
}
class UncheckedExceptionExample {
    public void divide(int numerator, int denominator) {
        int result = numerator / denominator;
        System.out.println("Unchecked result "+result);
    }
}
public class exceptionType {

	public static void main(String[] args) {
		CheckedExceptionExample ce=new CheckedExceptionExample();
		UncheckedExceptionExample ue=new UncheckedExceptionExample();
		ce.divideException();
		ue.divide(10,5);
	}
}
