
package javacertification_v1;

public class Question {
	private String questionText;
	private String[] answerOptions;
	private String[] correctAnswers;
	private String answerText;
	
	public Question() {
		System.out.println("Конструктор Question");
	}
	
	

	public Question(String questionText, String[] answerOptions, String[] correctAnswers, String answerText) {
		this.questionText = questionText;
		this.answerOptions = answerOptions;
		this.correctAnswers = correctAnswers;
		this.answerText = answerText;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String[] getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(String[] answerOptions) {
		this.answerOptions = answerOptions;
	}

	public String[] getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(String[] correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public String getExplanation() {
		return answerText;
	}

	public void setExplanation(String explanation) {
		this.answerText = explanation;
	}
	
	
}
