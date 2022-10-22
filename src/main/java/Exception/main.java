package Exception;

import java.util.Scanner;

// Исключения. чтобы поймать исключения, можно воспользоваться блоком try catch
// для этого весь код должен находится в блоке try
public class main {
    public static void main(String[] args) {
        // создаем масс с тремя элементами {1,2,3} индексы 0,1,2 , а просим вывести четвертый элемент с индексом [3]
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(" Ошибка! Вы вышли за пределы массива");
        }

 //делим число а на б, при этом вводим вместо б не число, а букву
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = scn.nextInt();
            System.out.println("Введите второе число");
            int b = scn.nextInt();
            System.out.println("Первое число делим на второе, ответ: " + (a / b));
        } catch (Exception e){
            System.out.println("Введены неверные данные");
        }finally {
            System.out.println("В любом случае выполняется какая-то операция ");
      }

    }
}
