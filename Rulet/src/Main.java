import java.util.Scanner;

import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        if (N < 1 & N > 2 * Math.pow(10, 9)) {
            return;
        }
        ;
        int x = (int) ceil((Math.log(N) / Math.log(2)));
        System.out.println(x);
    }
}
