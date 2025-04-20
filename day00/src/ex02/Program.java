package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int res = 0;
        while (a != 42) {
            a = scanner.nextInt();

            if (isPrime(sumOfDigits(a))) res++;
        }
        System.out.println("Count of coffee-request - " + res);
    }

    private static int sumOfDigits(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    } 

    private static boolean isPrime(int num) {
        if (num <= 1) { 
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
