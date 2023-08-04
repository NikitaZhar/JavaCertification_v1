package javacertification_v1;

public class Question {
	private String questionText;
	private String[] answerOptions;
	private String[] correctAnswers;
	private String explanation;
	
	public Question(String questionText, String[] answerOptions, String[] correctAnswers, String answerText) {
		this.questionText = questionText;
		this.answerOptions = answerOptions;
		this.correctAnswers = correctAnswers;
		this.explanation = answerText;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String[] getAnswerOptions() {
		return answerOptions;
	}

	public String[] getCorrectAnswers() {
		return correctAnswers;
	}

	public String getExplanation() {
		return explanation;
	}
	
	public void printQuestionText() {
		System.out.println(questionText);
	}
	
	public void printAnswerOptions() {
		for(String answer : answerOptions) {
			System.out.println(answer);
		}
	}
	
	public void printCorrectAnswers() {
		for(String answer : correctAnswers) {
			System.out.println(answer);
		}
	}
	
	public void printExplanation() {
		System.out.println(explanation);
	}
}