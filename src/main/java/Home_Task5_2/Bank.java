package Home_Task5_2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int button, money;
        Bankomat bankomat=new Bankomat();
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:\n1. Пополнить счет\n2. снять наличные\n3. вернуть карту\n");
            button=scn.nextInt();
            if (button==1){
                System.out.println("Внесите сумму");
                money=scn.nextInt();
                bankomat.setCash(money);
            }else if(button==2){
                System.out.println("ВВедити сумму для снятия");
                money=scn.nextInt();
                bankomat.getCash(money);
            }else if(button==3){
                System.out.println("заберите карту");
                System.exit(0);
            }else {
                System.out.println("Неправильная кнопка");
                System.exit(0);
            }
        }
    }
}
