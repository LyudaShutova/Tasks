import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumPay;
        Scanner scanner = new Scanner(System.in);

        int abonentPriceMonth = scanner.nextInt();
        int mbTarifPerMonth = scanner.nextInt();
        int priceForMbOverTarif = scanner.nextInt();
        int qtyMb = scanner.nextInt();

        if (abonentPriceMonth < 1 || abonentPriceMonth > 100) {
            return;
        }
        if (mbTarifPerMonth < 1 || mbTarifPerMonth > 100) {
            return;
        }
        if (priceForMbOverTarif < 1 || priceForMbOverTarif > 100) {
            return;
        }
        if (qtyMb < 1 || qtyMb > 100) {
            return;
        }
        if (qtyMb > mbTarifPerMonth) {
            sumPay = abonentPriceMonth + (qtyMb - mbTarifPerMonth) * priceForMbOverTarif;
            System.out.println(sumPay);
        } else {
            sumPay = abonentPriceMonth;
            System.out.println(sumPay);
        }
    }
}