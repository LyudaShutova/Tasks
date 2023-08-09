package practice;

public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
    private static final double CONSTANT_FEE_FOR_CASH = 0.01;


    @Override
    public void take(double amountToTake) {
        super.take(amountToTake + amountToTake * CONSTANT_FEE_FOR_CASH);
    }
}
