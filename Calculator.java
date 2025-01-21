public class Calculator {
    public int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    public int subtraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    public int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    public int division(int[] numbers) {
        if (numbers[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numbers[0] / numbers[1];
    }

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

    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public double meanOfArray(int[] array) {
        return (double) sumOfArray(array) / array.length;
    }
}
