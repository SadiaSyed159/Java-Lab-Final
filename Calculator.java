import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//updated in future branch for merge operation 
        System.out.println("Helo WOlrd");
        System.out.print("Pehla number darj karein: ");
        double num1 = scanner.nextDouble();

        System.out.print("Operator darj karein (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Doosra number darj karein: ");
        double num2 = scanner.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Nateeja: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Nateeja: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Nateeja: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Nateeja: " + result);
                } else {
                    System.out.println("Ghalti: Zero (0) se divide nahi kiya ja sakta!");
                }
                break;
            default:
                System.out.println("Ghalti: Sahi operator (+, -, *, /) darj karein.");
        }
        scanner.close();
    }
}