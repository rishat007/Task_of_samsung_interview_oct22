import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double number_1, number_2, result;
        char operator;

        Scanner InputReader = new Scanner(System.in);
        System.out.print("Number 1: ");
        number_1 = InputReader.nextDouble();
        System.out.print("Number 2: ");
        number_2 = InputReader.nextDouble();
        System.out.println("Choose any operator (+ or - or * or /): ");
        operator = InputReader.next().charAt(0);

        switch (operator) {
            case '+':
                result = number_1 + number_2;
                System.out.println(number_1 + " + " + number_2 + " = " + result);
                break;
            case '-':
                result = number_1 - number_2;
                System.out.println(number_1 + " - " + number_2 + " = " + result);
                break;
            case '*':
                result = number_1 * number_2;
                System.out.println(number_1 + " * " + number_2 + " = " + result);
                break;
            case '/':
                result = number_1 / number_2;
                System.out.println(number_1 + " / " + number_2 + " = " + result);
                break;
            default:
                System.out.println("Choose The Correct Operator !");
                break;
        }
    return;
    }
}