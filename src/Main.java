public class Main {
    public static void main(String[] args) {

        int initialDeposit = 100;  //  начальный счет

        int depositAmount = 1100; // сумма пополнения

        int bonusValue = 1; // минимальное значение бонуса

        int bonusAmount = depositAmount / 100; // количество бонусов


        if (depositAmount > 1000) {

            System.out.println("Итоговый счет: " + (initialDeposit + depositAmount + bonusAmount));
        } else {

            System.out.println("Итоговый счет: " + (initialDeposit + depositAmount));
        }
    }
}



