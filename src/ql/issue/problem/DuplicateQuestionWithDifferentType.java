package ql.issue.problem;

public class DuplicateQuestionWithDifferentType extends Problem {

	public DuplicateQuestionWithDifferentType(String identifier, int lineNumber) {
		super.errorMessage = String
				.format("Duplicate question with a different type. Identifier: %s. At line number: %d",
						identifier,
						lineNumber);
	}
}
