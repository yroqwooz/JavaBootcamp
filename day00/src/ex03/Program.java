package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int gradeStorage = 0;
        for (; i < 19; i++) {
            String weekString = scanner.nextLine();
            if (weekString.equals("42")) break;
            if (!weekString.equals("Week " + i)) errorHandler();
            int minGrade = 42;
            for (int j = 0; j < 5; j++) {
                int currGrade = scanner.nextInt();
                if (currGrade < 1 || currGrade > 9) errorHandler();
                if (currGrade < minGrade) minGrade = currGrade;
            }

            scanner.nextLine();
            gradeStorage = storeMinGrade(gradeStorage, minGrade);
        }
        printGraph(gradeStorage);

    }
    private static int storeMinGrade(int gradeStorage, int gradeNew) {
        int temp = gradeStorage;
        while (temp != 0) {   
            gradeNew *= 10;
            temp /= 10;
        }
        gradeStorage += gradeNew;
        return gradeStorage;
    }

    private static void printGraph(int grades) {
        int currGrade = 0;
        int week = 1;
        while (grades > 0) {
            System.out.print("Week " + week + " ");
            currGrade = grades % 10;
            for (int i = 0; i < currGrade; i++) {
                System.out.print("=");
            }
            System.out.println(">");
            week++;
            grades /= 10;
        }
    }

    private static void errorHandler() {
        System.err.println("Illegal Argument");
        System.exit(-1);
    }

    // private static 

    // private static void 
}
