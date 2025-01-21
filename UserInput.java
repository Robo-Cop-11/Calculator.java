import java.util.Scanner;

public class UserInput {
    public void startCalculator() {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Sum of Array");
            System.out.println("7. Mean of Array");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    int[] additionInput = inputTwoNumbers();
                    System.out.println("Result: " + calculator.addition(additionInput));
                    break;
                case 2:
                    int[] subtractionInput = inputTwoNumbers();
                    System.out.println("Result: " + calculator.subtraction(subtractionInput));
                    break;
                case 3:
                    int[] multiplicationInput = inputTwoNumbers();
                    System.out.println("Result: " + calculator.multiplication(multiplicationInput));
                    break;
                case 4:
                    int[] divisionInput = inputTwoNumbers();
                    System.out.println("Result: " + calculator.division(divisionInput));
                    break;
                case 5:
                    System.out.print("Enter the number of terms for Fibonacci: ");
                    int terms = scan.nextInt();
                    calculator.fibonacci(terms);
                    break;
                case 6:
                    int[] arrayForSum = inputArray();
                    System.out.println("Sum: " + calculator.sumOfArray(arrayForSum));
                    break;
                case 7:
                    int[] arrayForMean = inputArray();
                    System.out.println("Mean: " + calculator.meanOfArray(arrayForMean));
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);
    }

    public int[] inputTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.print("Enter first number: ");
        numbers[0] = scan.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = scan.nextInt();
        return numbers;
    }

    public int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
        return array;
    }
}
