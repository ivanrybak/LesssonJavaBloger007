package GetSet;

public class MyCar {
    private int oil;
    private int temp;

    //чтобы создать геттер или сеттер, пишем поле напр fuel и idea подсказывает выбор метода.

  // сеттер- устанавливает значение, геттер принимает значение.
    public void setOil(int oil) {
        if (oil <95 || oil >98){
            System.out.println("Fuel not correct");
        }else
        this.oil = oil;
        System.out.println("Fuel is good");
    }

    public void setTemp(int temp) {
        if (temp<-40){
            System.out.println("Low temperature");
        }else
        this.temp = temp;
        System.out.println("Temperature is good");

    }

    public int getOil() {
        return oil;
    }

    public int getTemp() {
        return temp;
    }
}
