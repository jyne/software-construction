package ql.issue.problem;

public class InvalidTypeForOperand extends Problem {
	public InvalidTypeForOperand(int lineNumberExpression, String expectedType, String actualType) {
		super.errorMessage = String
				.format("Invalid type for operant. Expected Type: %s. Actual type: %s. On line number: %d",
						expectedType, actualType, expression.getLineNumber());
	}
}
