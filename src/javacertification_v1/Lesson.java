package javacertification_v1;
import java.util.Random;
import java.util.stream.IntStream;

public class Lesson extends Questions {
	final int NUMBER_NEW_QUESTIONS = 3;
	
	private Question[] questionsForLesson = new Question[NUMBER_NEW_QUESTIONS];
	
	public Lesson() {
	}
	
	public void manageLesson() {
		questionsForLesson = getQuestionsForLesson();
		
		for (Question question : questionsForLesson) {
			System.out.println("\n");
			question.printQuestionText();
			question.printAnswerOptions();
			question.printCorrectAnswers();
			question.printExplanation();
		}
	}
	
	private String getAnswer() {
		return "";
	}
	
	private boolean checkAnswer() {
		return true;
	}
	
	private Question[] getQuestionsForLesson() {
		Question[] selectedQuestions = new Question[NUMBER_NEW_QUESTIONS];
		int[] listIndexes = shuffleArrayOfIndex(getTotalNumberOfQuestions());
		
		for(int index = 0; index < NUMBER_NEW_QUESTIONS; index++) {
			selectedQuestions[index] = questions[listIndexes[index]];
		}
		return selectedQuestions;
	}
	
	private int[] shuffleArrayOfIndex(int arraySize) {
		int[] listSelectedIndexes = IntStream.rangeClosed(0, arraySize - 1).toArray();
		Random rn = new Random();

		for (int index = 0; index < arraySize; index++) {
			int randomIndex = index + rn.nextInt(arraySize - index);
			int temp = listSelectedIndexes[index];
			listSelectedIndexes[index] = listSelectedIndexes[randomIndex];
			listSelectedIndexes[randomIndex] = temp;
		}
		return listSelectedIndexes;
	}

	private int increaseScore() {
		return 0;
	}
	
	private int decreaseScore() {
		return 0;
	}
	
}
