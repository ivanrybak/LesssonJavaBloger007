package OverridingMethods;

//создали класс банкомат1, который является наследником банкомата. Далее создаем объект b1 и вызываем у него методы класса банкомат
public class Bankomat1 extends Bankomat {
    public static void main(String[] args) {
        Bankomat1 b1 = new Bankomat1();
        b1.methodOut(); //в консоль выдаст "возьмите чек"
        //если создать такой же метод как и у класса родителя methodOut в наследуемом классе, то его необходимо будет переопределить
        // теперь в консоль выдаст "возьмите наличные"

    }
    @Override
    void methodOut(){
        System.out.println("Возьмите наличные");
    }
}
