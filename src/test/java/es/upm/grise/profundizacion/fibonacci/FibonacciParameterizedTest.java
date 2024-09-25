package es.upm.grise.profundizacion.fibonacci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciParameterizedTest {

	@ParameterizedTest 
	@CsvSource( { "0, 0",
				  "1, 1",
				  "10, 55",
				  "47, 2971215073" })
	public void TestFibonacciCalculation(int number, long factorial) throws InvalidNumberException {
		assertEquals(factorial, Fibonacci.calculate(number));
	}
}
