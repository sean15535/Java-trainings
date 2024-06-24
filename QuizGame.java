import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        // Array of questions
        String[] questions = {
                "1. What is the capital of France?\nA) Paris\nB) London\nC) Berlin\nD) Madrid",
                "2. What is 2 + 2?\nA) 3\nB) 4\nC) 5\nD) 6",
                "3. Who wrote 'Hamlet'?\nA) Charles Dickens\nB) Jane Austen\nC) William Shakespeare\nD) Mark Twain",
                "4. What is the largest planet in our solar system?\nA) Earth\nB) Mars\nC) Jupiter\nD) Saturn",
                "5. What is the chemical symbol for water?\nA) CO2\nB) H2O\nC) O2\nD) NaCl"
        };

        // Array of correct answers
        char[] answers = {'A', 'B', 'C', 'C', 'B'};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        char userAnswer;
        int score = 0;

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next().toUpperCase().charAt(0);

            // Validate and check user answer
            if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                if (userAnswer == answers[i]) {
                    score++;
                }
            } else {
                System.out.println("Invalid option. Please enter A, B, C, or D.");
                i--; // Re-ask the same question
            }
        }

        // Calculate and display the final score
        double percentage = (double) score / questions.length * 100;
        System.out.println("Your final score: " + score + "/" + questions.length);
        System.out.printf("Your score in percentage: %.2f%%\n", percentage);

        // Close the scanner
        scanner.close();
    }
}
