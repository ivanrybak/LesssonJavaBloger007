package Home_Task5;

import java.util.Scanner;

public class Bankomat {
    public int pin;
    public int money;
    static int[] sum = new int[3];
    int myBalance;

    public static void setSum(int i) {
        Bankomat.sum[2] = i;
    }

    public void methodIn() {
        int card;
        System.out.println("Вставте карту 1-да, 2 нет");
        Scanner scr = new Scanner(System.in);
        card = scr.nextInt();
        if (card == 1) {
            System.out.println("ВВедите пароль");
                     pin = scr.nextInt();
            if (pin == 1234) {

                System.out.println("Внести наличные нажми: 1/ снять наличные нажми: 2");
                  money = scr.nextInt();
                if (money == 1) {
                    System.out.println("Укажите внесенную сумму");
                    sum[0] = scr.nextInt();
                } else if (money == 2) {
                    System.out.println("Укажите снятую сумму");
                     sum[1] = scr.nextInt();
                }

            } else if (pin != 1234) {
                System.out.println("Неверный пароль! Заберите карту!");
            }

        } else if (card == 2) {
            System.out.println("До свиданья!");
        }


    }


    public int MyBalance() {
        myBalance = sum[2] + sum[0] - sum[1];
        if (myBalance < 0) {
            System.out.println("недостаточно средств");
            System.out.println("баланс карты: "+ sum[2]);
        } else {
            System.out.println("баланс карты: "+myBalance);

        }

        return myBalance;
    }

}
