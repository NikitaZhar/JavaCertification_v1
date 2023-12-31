package javacertification_v1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Questions {
	
	// Подумать где лучше разместить константы
	
	final int NUMBER_RENEWED_QUESTIONS = 5;
	final int NUMBER_QUESTIONS_FOR_TEST = 5;

	Question[] questions;

	Questions() {
		ArrayList<Question> stackQuestions = readQuestionsFromFile();

		questions = new Question[stackQuestions.size()];
		questions = stackQuestions.toArray(questions);
	}
	
	protected int getTotalNumberOfQuestions() {
		return questions.length;
	}
	
	private ArrayList<Question> readQuestionsFromFile() {
		ArrayList <Question> questions = new ArrayList();
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new FileReader("init.txt"));
			scanner.useDelimiter("#");
			while(scanner.hasNextLine()) {
				String question = scanner.next();
				scanner.skip(scanner.delimiter());
				String code = scanner.next();
				scanner.skip(scanner.delimiter());
				String answerOptions[] = scanner.next().split("%%");
				scanner.skip(scanner.delimiter());
				String correctAnswers[] = scanner.next().split("%%");
				scanner.skip(scanner.delimiter());
				String answerText = scanner.nextLine();		
				questions.add(new Question(
						question,
						code,
						answerOptions,
						correctAnswers,
						answerText));
			}
		} catch(IOException e) {
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		return questions;
	}
}
