import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int temp = 0;
        b = temp + a; // 20
        a = b + a;
        System.out.println("First = " + a);
        System.out.println("Second = " + b);
        sc.close();
    }
}
