
package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private static LocalDate lastIncome = null;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        if (lastIncome.plusDays(30).isBefore(LocalDate.now())) {
            super.take(amountToTake);
        } else {
            System.out.println("NO");
        }
    }
}
