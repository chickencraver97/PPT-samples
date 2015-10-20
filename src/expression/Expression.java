package expression;

public class Expression {

	private String expression;
	
	/**
	 * 
	 * @param expression
	 * @throws NullPointerException if expression is null
	 */
	public Expression(String expression) throws NullPointerException, IllegalArgumentException {
		if (expression == null)
			throw new NullPointerException("An expression cannot be null!");
		if (expression.equals(""))
			throw new IllegalArgumentException("An expression cannot be empty!");
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		// get the String representation, which is easy
		return expression;
	}
	
}
