package ql.issue.problem;

public class ConditionNonBoolean extends Problem {
	public ConditionNonBoolean(int expression, String expectedType, String actualType) {
		super.errorMessage = String
				.format("Invalid type for condition. Expected Type: %s. Actual type: %s. On line number: %d",
						expectedType, actualType, expression.getLineNumber());
	}
}
