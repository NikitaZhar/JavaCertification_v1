package javacertification_v1;

import java.util.ArrayList;

public class Question {
	private String questionText;
	private String codeText;
	private String[] answerOptions;
	private String[] correctAnswers;
	private String explanation;
	
	public Question(String questionText, String codeText, String[] answerOptions, String[] correctAnswers, String answerText) {
		this.questionText = questionText;
		this.codeText = codeText;
		this.answerOptions = answerOptions;
		this.correctAnswers = correctAnswers;
		this.explanation = answerText;
	}

	public String getQuestionText() {
		int response = questionText.indexOf(" ", 0);
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
		for(String textToPrint : getSplittedString(questionText)) {
			System.out.println(textToPrint);
		}
		System.out.println(codeText);
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
		for(String toPrint : getSplittedString(explanation)) {
			System.out.println(toPrint);
		}
	}
	
	
	// Print lengthOfString = 80 symbols in the string
	
	private String[] getSplittedString(String inputString) {
		ArrayList <String> buffer = new ArrayList();
		int lengthOfString = 80;
		int startIndex = 0;
		int endIndex = startIndex + lengthOfString;
		boolean endLoop = true;
		do {
			int nextBlank = inputString.indexOf(" ", endIndex);
			if (nextBlank != -1) {
//				System.out.println(" 1 " + inputString.substring(startIndex, nextBlank));
				buffer.add(inputString.substring(startIndex, nextBlank));
			} else {
//				System.out.println(" 2 " + inputString.substring(startIndex));
				buffer.add(inputString.substring(startIndex));
				endLoop = false;
			}
			startIndex = nextBlank + 1;
			endIndex = startIndex + lengthOfString;
		} while (endLoop);
		String[] splittedInput = new String[buffer.size()];
		
		return buffer.toArray(splittedInput);
	}
}