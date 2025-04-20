package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int num = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }

        if (num <= 1) { 
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        int count = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i != 0) {
                count++;
            } else {
                System.out.println("false " + count);
                System.exit(0);
            }
        }

        System.out.println("true " + count);
    }
}
