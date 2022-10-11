package OOP;
/*есть волк собака и дикая собака.
наследование это когда поля экземпляра класса наследника наследуются от родителя
т.е. поля рост и вес от волка наследуются остальным
инкапсуляция это когда не дается общего доступа для каких либо полей или значений экземпляра класса (с помощью геттеров и сеттеров)
полиморфизм- это когда один и тот же метод у всех классов наследников, выполняет разное действие*/
public class main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.height = 50;
        wolf.weight = 70;
        wolf.say();
        wolf.setHeight(170);
        System.out.println(wolf.getHeight());
        Dog dog = new Dog();
        WildDog wildDog = new WildDog();

        wildDog.say();
        dog.say();

    }
}
