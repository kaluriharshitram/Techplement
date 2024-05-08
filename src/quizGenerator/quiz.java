package quizGenerator;
import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the list of questions
        String[] questions = {
            "Which of the following option leads to the portability and security of Java?",
            "Which of the following is not a Java features?",
            "_____ is used to find and fix bugs in the Java programs.?",
            "What is the return type of the hashCode() method in the Object class?",
            "What does the expression float a = 35 / 0 return?",
            "Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
            "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?",
            "In which process, a local variable has the same name as one of the instance variables?",
            "Which of the following is true about the anonymous inner class?",
            "Which package contains the Random class?"
        };

        // Create the list of answers
        String[][] answers = {
            {"Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling"},
            {"Dynamic","Architecture Neutral","Use of pointers"},
            {"JVM","JDK","JDB"},
            {"Object","int","long"},
            {"0","Run time exception","Infinity"},
            {"javap tool","javaw command","Javadoc tool"},
            {"getName()","getClass()","toString()"},
            {"Serialization","Variable Shadowing","Abstraction"},
            {"It has only methods","It has no class name","It has a fixed class name"},
            {"java.util package","java.lang package","java.awt package"}
        };

        // we have given a list of correct answers
        int[] correctAnswers = {1,3,3,2,3,3,1,2,2,1};
        int score=0;

        // Ask the user each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println((j + 1) + ". " + answers[i][j]);
            }

            // Get the user's answer
            int answer = scanner.nextInt();
            
            // compare the Answer is True or False
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }
        }
    

        // Printing the user score
        System.out.println("Your score is " + score);
        
        //feed back based on score
        if(score<6) {
        	System.out.println("All the best for next time");
        }
        else if (score<10) {
			System.out.println("Almost achived keep trying");
		}
        else if(score==10) {
        	System.out.println("You have cleared all the questions");
        }
    }
}