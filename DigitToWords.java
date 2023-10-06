import java.util.Scanner;

class DigitToWords {
    public static void main(String[] args) {
        System.out.print("Enter a four digi number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // num = 1234
        int th = num / 1000; // 1
        int h = (num / 100) % 10;// 2
        int t = (num % 100) / 10;// 3
        int u = num % 10; // 4
        int sum = th + h + t + u;
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}