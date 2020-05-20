import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignmentWeek5 {
	public static void main(String[] args) throws IOException {
		Question Q1 = new Question("1. Who is president of India?", "a. Donald Trump", "b. Ramnath Kovind",
				"c. Narendra Modi", "d. None", "c");
		Question Q2 = new Question("2. Which of the following languages is more suited to a structured program?",
				"a. PL/1", "b. FORTRAN", "c. BASIC", "d. PASCAL", "d");
		Question Q3 = new Question("3. The brain of any computer system is", "a. ALU", "b. Memory", "c. CPU",
				"d. Control unit", "c");
		Question Q4 = new Question("4. Which of the following is the 1's complement of 10?", "a. 01", "b. 110", "c. 11",
				"d. 10", "a");
		Question Q5 = new Question(
				"5. A section of code to which control is transferred when a processor is interrupted is known as",
				"a. M", "b. SVC", "c. IP", "d. MDR", "a");
		Question Q6 = new Question("6. Which part interprets program instructions and initiate control operations.",
				"a. Input", "b. Storage unit", "c. Logic unit", "d. Control unit", "d");
		Question Q7 = new Question("7. The binary system uses powers of", "a. 2", "b. 10", "c. 8", "d. 16", "a");
		Question Q8 = new Question("8. A computer program that converts assembly language to machine language is",
				"a. Compiler", "b. Assembler", "c. Interpreter", "d. Comparator", "b");
		Question Q9 = new Question("9. The time for which a piece of equipment operates is called", "a. Seek time",
				"b. Access time", "c. Real time", "d. Effective time", "d");
		Question Q10 = new Question("10. Which access method is used for obtaining a record from a cassette tape?",
				"a. Direct", "b. Sequential", "c. Random", "d. All of the above", "b");

		Question questionList[] = { Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10 };

		for (int i = 0; i < questionList.length; i++) {
			System.out.println(questionList[i].getQuestion());
			System.out.println(questionList[i].getOpt1());
			System.out.println(questionList[i].getOpt2());
			System.out.println(questionList[i].getOpt3());
			System.out.println(questionList[i].getOpt4());
			System.out.print("Enter your answer: ");

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			long startTime = System.currentTimeMillis();
			while ((System.currentTimeMillis() - startTime) < 10000 && !in.ready()) {
			}

			if (in.ready()) {
				if (!in.readLine().equals(questionList[i].getCorrectOpt()))
					System.out.println("Sorry wrong answer");
			} else {
				System.out.println("\nTIMEOUT!!!");
				System.exit(0);
			}
			System.out.println();
		}
	}

}
