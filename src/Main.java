public class Main {
    public static void main(String[] args) {

        int x = 100;  //  начальный счет

        int y = 1100; // сумма пополнения

        int b = 1; // минимальное значение бонуса

        int k = y / 100; // количество бонусов


        if (y > 1000) {

            System.out.println("Итоговый счет: " + (x + y + k));
        }else {

                System.out.println("Итоговый счет: " + (x + y));
            }
            }
        }



