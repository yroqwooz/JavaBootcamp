package ex00;
public class Program {
    public static void main(String[] args) {
        int num = 479598;
        if (num < 0) num = -num;
        if (num < 10000 || num > 999999 ) System.exit(1);
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        System.out.println(res);
    }
}
