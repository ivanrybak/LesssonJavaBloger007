package DataEntry;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        //ввод данных пользователя

        Scanner scn=new Scanner(System.in);  //создаем объект класса сканнер
        //методы класса Scanner:
        //next(); - считывает строку до первого пробела
        //nextLine(); - считывает всю строку
        //nextInt(); -||-||-целое число;
        //nextDouble(); - нецелое число;
        System.out.print("ВВедите число больше чем 4: ");
        int a=scn.nextInt();
        if (a>=4){
            System.out.println("Верно, "+ a+ ">=4");
        }else {
            System.out.println("Не верно, "+ a+"<4");
        }


        System.out.println("Форматированный вывод %d");
              //форматированный ввод System.out.printf  %d-спецификатор d-целочисленное число, f-число с плавающей точкой
             // %s-вывод текста
        int v=2;
        int w=4;
        System.out.printf("v=%d\n w=%d\n",v,w);
        double v1=3.3322;
        double w1=5.99690;
        System.out.printf("v1=%f\nw1=%f\n",v1,w1);
        System.out.printf("v1=%.2f\nw1=%.3f\n",v1,w1);  //%.2f -выводится 2 знака после запятой
        String num1="Число1=";
        String num2="Число2=";
        System.out.printf("%s%.2f\n%s%.3f",num1,v1,num2,w1); // мы написали, что num1=3.33, num2=5.997,





    }
}
