package Constructor;
/*создаем класс магазин и продукты.
далее создаем объект корзана класса продукты, и сразу вписываем значения в конструктор.*/
public class Shop {
    public static void main(String[]args){
        Products basket1=new Products("Baguet","Carrot",5);  //подставляем значения полей в конструкторах
        Products basket2=new Products("Bauget",50);
        System.out.println("Цена покупок: "+basket2.getCoast());  //с помощью геттера выводим цену второй корзины в консоль

    }
}
