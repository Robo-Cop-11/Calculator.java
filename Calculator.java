public class Calculator {
    // Method to add two numbers
    public int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Method to subtract two numbers
    public int subtraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Method to multiply two numbers
    public int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Method to divide two numbers
    public int division(int[] numbers) {
        if (numbers[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numbers[0] / numbers[1];
    }

    // Method to display the Fibonacci sequence up to a given number of terms
    public void fibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Method to calculate the sum of an array
    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the mean of an array
    public double meanOfArray(int[] array) {
        return (double) sumOfArray(array) / array.length;
    }
}
