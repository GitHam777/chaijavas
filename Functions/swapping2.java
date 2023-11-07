import java.util.Scanner;

public class swapping2 {
    static void swap(int a, int b) {
        System.out.println("Original value before swap: ");
        System.out.println("A = " + a + " B = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swapping: ");
        System.out.println("A = " + a + " B = " + b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            System.out.print("A = ");
            a = sc.nextInt();
            System.out.print("B = ");
            b = sc.nextInt();
            swap(a, b);
        }
    }
}