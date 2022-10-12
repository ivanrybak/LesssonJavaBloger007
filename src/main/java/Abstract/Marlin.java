package Abstract;

public class Marlin extends Fish{
    @Override
    void swim() {
        super.swim();
        System.out.println("Marlin swim");
    }

    @Override
    void breath() {
        super.breath();
        System.out.println("Marlin breath");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Marlin eat");
    }
}
