package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        char[] char_line;
        try (Scanner scanner = new Scanner(System.in)) {
            char_line = scanner.next().toCharArray();
        }
        System.out.println(char_line.length);
        int[] list = GetCharRating(char_line);
        int[] top_indexes = GetTopIndexes(list);

        for (int i : top_indexes) {
            System.out.print(list[i] + " ");
        }

    }

    private static int[] GetCharRating(char[] arr) {
        int[] seq = new int[65535];
        for (int i : arr) {
            seq[i]++;
        }
        return seq;
    }

    private static int[] GetTopIndexes(int[] arr) {
        int[] tempFrequencies = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempFrequencies[i] = arr[i];
        }
        int[] indexes = new int[10];
        for (int i = 0; i < 10; i++) {
            int maxValue = 0;
            int maxIndex = 0;
            for (int j = 0; j < tempFrequencies.length; j++) {
                if (tempFrequencies[j] > maxValue) {
                    maxValue = tempFrequencies[j];
                    maxIndex = j;
                }
            }
            indexes[i] = maxIndex;
            tempFrequencies[maxIndex] = 0;
        }
        return indexes;
    }

    private static void PrintGraph(int[] list, int[] indexes) {
        double coeff = list[0] / 10;
        for (int i = 0; i < 10; i++) {
            
        }
    }   
}
