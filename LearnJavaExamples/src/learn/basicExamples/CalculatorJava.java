package learn.basicExamples;


public class CalculatorJava {

	static float num1 = 5;
	static float num2 = 2;

	static float sum;
	static float subtraction;
	static float multiplication;
	static float division;

	static CalcFunctions c;

	public static void main(String[] args) {

		c = new CalcFunctions();

		System.out.println("num1: " + num1 + " and num2: " + num2);
		System.out.println("Sum of num1, num2 is : " + c.add(num1, num2));
		System.out.println("Subtraction of num1, num2 is : "
				+ c.subtract(num1, num2));
		System.out.println("Multiplication of num1, num2 is : "
				+ c.multiply(num1, num2));
		System.out.println("Division of num1, num2 is : " + c.divide(num1, num2));

	}

}
