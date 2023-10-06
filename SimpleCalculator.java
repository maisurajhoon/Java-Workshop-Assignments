import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Welcome to the Simple Calculator!");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (sqrt)");
            System.out.println("6. Swap Two Numbers (swap)");
            System.out.print("Enter your choice (1-6): ");

            int operation = sc.nextInt();

            if (operation >= 1 && operation <= 6) {
                if (operation >= 1 && operation <= 4) {
                    System.out.println("Enter the first number: ");
                    int num1 = sc.nextInt();

                    System.out.println("Enter the second number: ");
                    int num2 = sc.nextInt();

                    if (operation == 1) {
                        int result1 = num1 + num2;
                        System.out.println("Result of Addition: " + result1);
                    } else if (operation == 2) {
                        int result2 = num1 - num2;
                        System.out.println("Result of Subtraction: " + result2);
                    } else if (operation == 3) {
                        int result3 = num1 * num2;
                        System.out.println("Result of Multiplication: " + result3);
                    } else if (operation == 4) {
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero.");
                        } else {
                            int result4 = num1 / num2;
                            System.out.println("Result of Division: " + result4);
                        }
                    }
                } else if (operation == 5) {
                    System.out.print("Enter the number: ");
                    double num = sc.nextDouble();
                    if (num < 0) {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    } else {
                        double result = Math.sqrt(num);
                        System.out.println("Square root of " + num + ": " + result);
                    }
                } else if (operation == 6) {
                    System.out.println("Enter the first number: ");
                    int x = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int y = sc.nextInt();
                    System.out.println("Values before swapping: x = " + x + ", y = " + y);
                    int temp = x;
                    x = y;
                    y = temp;
                    System.out.println("Values after swapping: x = " + x + ", y = " + y);
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using the Simple Calculator!");
        sc.close();
    }
}
