package Abstract;

public class Shark extends Fish{
    @Override
    void swim() {
        super.swim();
        System.out.println("Shark swim");
    }

    @Override
    void breath() {
        super.breath();
        System.out.println("Shark breath");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("shark eat");
    }
}
