import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class exceptionHandling {

	public static void main(String[] args) {
		        try {
		            int numerator = 10;
		            int denominator = 0;
		            int result = doDivide(numerator, denominator);
		            System.out.println("Division result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero");
		        }
		         finally {
		            System.out.println("Closing file...");
		        }
		    }

		    public static void openFile() throws IOException {
		        throw new IOException("File not found");
		    }

		    public static int doDivide(int a, int b) throws ArithmeticException {
		        if (b == 0) {
		            throw new ArithmeticException("Division by zero");
		        }
		        return a / b;
		    }
		}

