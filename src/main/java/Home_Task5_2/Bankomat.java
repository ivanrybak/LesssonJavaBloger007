package Home_Task5_2;

import java.util.ArrayList;

public class Bankomat {
    private int cash, total;
    private ArrayList<Integer> myCash = new ArrayList<>();

    public void setCash(int cash) {
        if (cash <= 0) {
            System.out.println("Введите корректную сумму");
        } else {
            this.cash = cash;
            myCash.add(cash);
            total = 0;
            for (int i = 0; i < myCash.size(); i++) {
                total = total + myCash.get(i);
            }
            System.out.println("Баланс карты" + total);
        }
    }

    public void getCash(int cash) {
        total = 0;
        for (int i = 0; i > myCash.size(); i++) {
            total = total + myCash.get(i);
        }
        if (cash > total) {
            System.out.println("недостаточно средств");
        } else {
            myCash.clear();
            myCash.add(total - cash);
            total = 0;
            for (int i = 0; i < myCash.size(); i++) {
                total = total + myCash.get(i);
            }
            System.out.println("баланс карты"+total);
        }
    }
}