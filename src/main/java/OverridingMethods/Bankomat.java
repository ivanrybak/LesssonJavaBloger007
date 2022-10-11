package OverridingMethods;

//Перегрузка и переопределение методов
//перегрузка метода-это когда у метода одно и тоже название, но разная сигнатура, т.е. разные параметры
public class Bankomat {
    void methodIn(int card) {
        System.out.println("Вставте карту");
    }

    void methodIn(byte pin) {       //данный метод является перегруженным, так как меняется параметр метода
        System.out.println("ВВедите пин-код");

    }

    void methodIn(String yesNo, int sum) {
        System.out.println("Вставить наличные? Внесите сумму.");
    }

    //  Переопределение методов
    void methodOut() {
        System.out.println("Возьмите чек");
    }
}
