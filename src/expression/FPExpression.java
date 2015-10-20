package expression;

public class FPExpression extends Expression {

	/**
	 * Constructor for FPExpression. This is a private constructor. Objects of
	 * this type can only be created by clients through a call to the static
	 * method 'getFPExpression(String)' or 'getFPExpression(Expression)'. This
	 * is to preserve the representation invariant and the sub-typing
	 * relationship.
	 * 
	 * @param expression
	 */
	private FPExpression(String expression) {
		super(expression);
	}

	/**
	 * 
	 * @param expression
	 * @return an FPExpression object with the same input expression if the
	 *         input expression is fully parenthesized.
	 * @throws IllegalArgumentException
	 *             if the input is not a valid fully parenthesized expression.
	 */
	public static FPExpression getFPExpression(String expression)
			throws IllegalArgumentException {
		// TODO: Implement this method

		// If the input String is a valid fully parenthesized expression then
		// the following statement is correct.
		// This uses the private constructor.
		return new FPExpression(expression);
	}

	/**
	 * 
	 * @param expression
	 * @return an FPExpression object with the input expression string if the
	 *         input expression is fully parenthesized. 
	 * @throws IllegalArgumentException
	 *             if the input is not a valid fully parenthesized expression.
	 */
	public static FPExpression getFPExpression(Expression expression)
			throws IllegalArgumentException {
		// TODO: Implement this method. Somewhat similar to the method above.

		return null; // change this for sure!

	}

	/**
	 * Given an Expression, check if the expression is a fully parenthesized
	 * expression.
	 * 
	 * @param expression
	 * @return true if expression is fully parenthesized and false otherwise
	 */
	public static boolean isFPExpression(Expression expression) {
		// This method is okay. Don't have to change this.
		return isFPExpression(expression.toString());
	}

	/**
	 * Given a String check if the string represents a fully parenthesized
	 * expression.
	 * 
	 * @param expression
	 * @return true if expression is fully parenthesized and false otherwise
	 */
	public static boolean isFPExpression(String expression) {
		// TODO: Implement this method
		return true; // change this
	}

}
