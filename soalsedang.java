import java.util.Random;
import java.util.Scanner;

public class soalsedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] operators = {"*", "/", "%"};
        boolean continueQuiz = true;

        System.out.println("Selamat datang di kuis matematika!, mari bermain ><");

 
        while (continueQuiz) {
            int bil1 = random.nextInt(10) + 1; 
            int bil2 = random.nextInt(10) + 1;  
            String operator = operators[random.nextInt(3)];

            
            System.out.print("Soal: " + bil1 + " " + operator + " " + bil2 + " = ");
            double correctAnswer = 0;

        
            switch (operator) { 
                case "*":
                    correctAnswer = bil1 * bil2;
                    break;
                case "/":
                    while (bil2 == 0) {
                        bil2 = random.nextInt(10) + 1; 
                    }
                    correctAnswer = (double) bil1 / bil2;
                    break;
                case "%":
                    correctAnswer = bil1 % bil2;
                    break;
            }

            double userAnswer = scanner.nextDouble();

            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueQuiz = false;
            }
        }

        System.out.println("Terima kasih telah bermain!");
    
    }
}
