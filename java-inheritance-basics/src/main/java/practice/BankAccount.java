package practice;

public class BankAccount {

    private double amountOfMoney;

    public double getAmount() {

        return amountOfMoney;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amountOfMoney += amountToPut;
        }
        System.out.println("Пополнение на сумму: " + amountToPut + " Баланс: " + amountOfMoney);
    }

    public void take(double amountToTake) {
        if (amountToTake > 0 && amountToTake <= amountOfMoney) {
            amountOfMoney -= amountToTake;
        }
        System.out.println("Снятие на сумму: " + amountToTake + "Баланс: " + amountOfMoney);
    }
}