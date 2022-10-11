package Home_Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //закоментировать строки, чтобы чтобы получилось 12
        int a, b, c;
        a = 2;
        //   b=3;
        c=4;
        //  a=b+c;
        b=c+2;
        // c=8;
        //  a=12+c;
        System.out.println(a+b+c);

      /*   используя if (else) написать код, который в зависимости от ввода сезона выведет в консоль
                название на английском языке*/
       /* Scanner in = new Scanner(System.in);
        System.out.print("Input a name season: ");
        String season = in.nextLine();*/
        String season= "Зима";
        if (season=="Зима"){
            System.out.println("Season Winter");
        }else if (season=="Весна"){
            System.out.println("Season Spring");
        }else if (season=="Лето"){
            System.out.println("Season Summer");
        }else  if (season=="Осень"){
            System.out.println("Season autumn");
        }

       /* Присвоить числу значение, от 1 до 10, используя оператор switch,
        вывести в консоль холодно, тепло,теплее, горячо,вы угадали*/
        int number=5;
        switch (number){
            case 1 :
                System.out.println("Холодно");
                break;
            case 2 :
                System.out.println("Теплее");
                break;
            case 3 :
                System.out.println("Ещё теплее");
                break;
            case 4 :
                System.out.println("Горячо");
                break;
            case 5 :
                System.out.println("Вы угадали");
                break;
            case 6 :
                System.out.println("Горячо");
                break;
            case 7 :
                System.out.println("Ещё теплее");
                break;
            case 8 :
                System.out.println("Теплее");
                break;
            case 9 :
                System.out.println("Холодно");
                break;
            case 10 :
                System.out.println("Холодно");
                break;
        }

        // с помощью while вывести число от одного до 10

        int num=1;
        while (num<=10){
            System.out.println(num);
            num++;
        }
// в обратном порядке
        int num2=10;
        while (num2>=1) {
            System.out.println(num2);
            num2--;
        }
        //используя for вывести в консоль четные числа от 0 до 20

        for (int x=0; x<=20; x=x+2){
            System.out.println(x);
        }
    }
}

