import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.delimiter();
        System.out.println("Введите n договоров и t минут");
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        if (n <= 2 || n >= 100) {
            return;
        }
        if (t <= 2 || t >= 100) {
            return;
        }
        int floors[] = new int[n];
        Scanner scanner1 = new Scanner(System.in);
        scanner.delimiter();
        System.out.println("Введите номера этажей");
        for (int i = 0; i < n; i++) {
            floors[i] = scanner1.nextInt();
            if (floors[i] > 100) {
                return;
            }
        }

        int lowFloor = floors[0];
        int lastFloor = floors[floors.length - 1];
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите индекс сотрудника t");
        int x = scanner2.nextInt();
        int numFloorT = 0;
        for (int i = 0; i < n; i++) {
            if (floors[i] == floors[x - 1]) {
                numFloorT = floors[i];
            }
        }
        int floorsMax[] = new int[lastFloor];
        for (int i = 0; i < lastFloor; i++) {
            floorsMax[i] = i + 1;
        }

        if (numFloorT > t) {
            if (numFloorT < lastFloor / 2) {
                System.out.println(numFloorT + lastFloor - 1 - lowFloor);
            } else {
                System.out.println((lastFloor) * 2 - numFloorT - lowFloor);
            }
        } else {
            System.out.println(lastFloor - lowFloor);
        }

    }
}