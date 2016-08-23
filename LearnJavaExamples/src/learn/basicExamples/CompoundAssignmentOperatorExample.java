package learn.basicExamples;

public class CompoundAssignmentOperatorExample {

	public static void main(String[] args) {
		
		/* Compound Assignment Operators are:
		 *  a += 10 => a = a+10
		 *  a -= 10 => a = a-10
		 *  a *= 10 => a = a*10
		 *  a /= 10 => a = a/10
		 *  a %= 10 => a = a%10
		 */
		
		int a = 1;
		int b = 2;
		int c = 3;
		a += 5;
		b *= 4;
		c += a * b;
		c %= 6; 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
	}

}
