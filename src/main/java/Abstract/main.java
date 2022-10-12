package Abstract;
//создаем абстрактный класс Рыба
//Создаем классы наследники акула и марлин, при этом автоматически переопределяются методы абстрактного класса

public class main {
    public static void main(String[] args) {
Marlin marlin=new Marlin();
marlin.swim();
marlin.breath();
marlin.eat();
Shark shark=new Shark();
shark.breath();
shark.eat();
shark.swim();
    }
}
