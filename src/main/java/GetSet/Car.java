package GetSet;

public class Car {
    public static void main(String[] args) {
MyCar car=new MyCar();
car.setOil(95);
car.setTemp(10);
        System.out.println("My fuel: " +car.getOil());
        System.out.println("Temperature overboart: "+car.getTemp());

    }
}
