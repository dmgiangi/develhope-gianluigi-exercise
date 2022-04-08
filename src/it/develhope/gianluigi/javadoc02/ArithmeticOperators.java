package it.develhope.gianluigi.javadoc02;

/**
 * this class manipulate number
 *
 * @author Gianluigi De Marco
 */
public class ArithmeticOperators {
    /**
     * this method sum two int and return the result
     *
     * @param a first int
     * @param b second int
     * @return the sum of the two int
     */
    int sum(int a, int b) {
        return a + b;
    }

    /**
     * this method subtract two int and return the result
     *
     * @param a int minuend
     * @param b int subtrahend
     * @return the difference between a and b
     */
    int sub(int a, int b) {
        return a - b;
    }

    /**
     * this method multiply two int and return the result
     *
     * @param a int first factor
     * @param b int second factor
     * @return the product between a and b
     */
    int mul(int a, int b) {
        return a * b;
    }

    /**
     * this method divide two int and return the result as int
     *
     * @param a int numerator
     * @param b int divisor
     * @return the int quotient
     */
    int div(int a, int b) {
        return (a / b);
    }
}
