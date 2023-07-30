package javacertification_v1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Current version v.1

public class JavaCertification {

	public static void main(String[] args) {
		Question[] listOfQuestions;
		var draftQuestions = getListOfQuestions();
		
		listOfQuestions = new Question[draftQuestions.size()];
		listOfQuestions = draftQuestions.toArray(listOfQuestions);

		int count = 1;
		for (Question question : listOfQuestions) {
			System.out.println(count + " : " + question.getQuestionText());
			for (String answer : question.getAnswerOptions()) {
				System.out.println("\t" + answer);
			}
			System.out.println("\n" + "Correct Answers:");
			for (String answer : question.getCorrectAnswers()) {
				System.out.println(answer);
			}
			System.out.println("Explanation : " + question.getExplanation() + "\n");
			
			count++;
		}
	}
	
	static ArrayList<Question> getListOfQuestions() {
		
		ArrayList <Question> questions = new ArrayList();
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new FileReader("init.txt"));
			scanner.useDelimiter("#");
			while(scanner.hasNextLine()) {
				String question = scanner.next();
				scanner.skip(scanner.delimiter());
				String answerOptions[] = scanner.next().split("%%");
				scanner.skip(scanner.delimiter());
				String correctAnswers[] = scanner.next().split("%%");
				scanner.skip(scanner.delimiter());
				String answerText = scanner.nextLine();				
				questions.add(new Question(
						question,
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
