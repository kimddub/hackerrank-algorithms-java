package warmup.easy;

import java.util.Scanner;

public class SolveMeFirst {

    static Scanner scanner = new Scanner(System.in);
    static int a;
    static int b;


    public static void main(String[] args) throws Exception {

        inputScanner();
        func();

        scanner.close();
    }

    static void inputScanner() throws Exception {
        a = scanner.nextInt();
        b = scanner.nextInt();
    }

    static void func() {
        System.out.println(Integer.sum(a, b));
    }
}
