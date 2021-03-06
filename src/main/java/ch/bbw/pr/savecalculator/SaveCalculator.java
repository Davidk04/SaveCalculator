package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int value1, int value2) throws ArithmeticException
	{
		long value = (long) value1 + (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 + value2;
	}

	//Noch un-safe Methoden, die müssen noch angepasst werden.
	public int subtraktion(int value1, int value2) throws ArithmeticException
	{
		long value = (long) value1 - (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return value1 - value2;
	}

	public double division(int value1, int value2) throws ArithmeticException
	{
		long value = (long) value1 / (long) value2;
		if (value > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return value1 / value2;
	}

	private double multiplication(Integer value1, Integer value2) throws ArithmeticException
	{
		long value = (long) value1 *  (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 * value2;
	}

	protected double dreieck(int seite, int hoehe) {
		return (double) seite * (double) hoehe / 2;
	}

	private int privateTest(int value1, int value2) throws ArithmeticException
	{
		long value = (long) value1 + (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 + value2;
	}


	//pow
	//sqrt
	//...
}
