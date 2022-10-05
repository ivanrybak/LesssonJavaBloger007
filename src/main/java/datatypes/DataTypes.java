package datatypes;

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[]args) {
        byte a;      // 8 byte;
        short b;       // 16;
        int c;         // 32;
        long d;        // 64;
        float f;       //  32;
        double s;      //  64; double более точное чем float (большее кол-во знаков после запятой)
        boolean h;      // true false
        String Str;      // text
        char ch = 'H';
        ;        //  symbol
        f = 1000f;
        s = 2301d;
        double resault = s / f;
        System.out.printf("%.2f", resault);   //количество знаков после запятой "%.8f"  только прописывать надо printf

        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'M';
//так жу существует таблица (коды символов ASCII), в которой символ представлен порядковым номером
        char c4 = 74;
        char c5 = 65;
        char c6 = 86;
        char c7 = 65;
        System.out.println("\n" + "ch= " + "c1+c2+c3= " + c1 + c2 + c3);
        System.out.println(c4 + "" + c5 + "" + c6 + "" + c7); //выдаст JAVA
        String str = "Hi";
        String first = "Java";
        String second = "blogger";
        int num = 007;
        System.out.print(str + " " + first + " " + second + " 00" + num);

        //коментарии:
        //-однострочный комментарий
        /*-многострочный коментарий  ctr+shift+/ */
        int x = 2;  //домашнее задание №1
        int y = 3;
        int z = x + y;
        System.out.println("\n" + "z=" + (x + y));
        System.out.println(z);
        char K = 'K';
        char A = 'a';
        char t = 't';
        char l = 'l';
        char e = 'e';
        char[] Kattle = {K, A, t, t, l, e};

        System.out.println(Kattle);
        System.out.println(K + "" + A + "" + t + "" + t + "" + l + "" + e);
        String name = "Ivan";
        String surname = "Ivanov";
        int age = 35;
        char gender = 'M';
        System.out.println("name:" + name + "\n" + "surname:" + surname + "\n" + "age:" + age + "\n" + "gender:" + gender);

        boolean i = 5 < 10;
        System.out.println(i);

        //Operator if
        System.out.println("\n"+"Operator if");
        int aw = 5;
        if (aw == 4) {
            System.out.println("Это правда");
        } else {
            System.out.println("Это ложь");
        }
        int month = 3;
        if (month <= 2 || month == 12) {
            System.out.println("Month " + month + " -this winter");
        } else if (month ==3 || month <=5) {
            System.out.println("Month " + month + " -this spring");
        } else if (month ==6 || month <= 8) {
            System.out.println("Month " + month + " -this summer");
        } else if (month ==9 || month <=11) {
            System.out.println("Month " + month + " -this autumn");
        } else if (month > 12) {
            System.out.println("Month " + month + " invalid value");
        }
            //Operator switch
        System.out.println("\n"+"Operator switch");
        switch (month){
            case 1:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            default:
                System.out.println("invalid value");
        }



        // цикл while, Do while
        System.out.println("\n"+"Cycle While");
        int number=1;
        while (number>1)
        {
            System.out.println(number--);
        }
        while (number<10){
            number=number+2;
            System.out.println(number);
        }


        int num2=10;
        do {
            System.out.println("num2="+num2);
            num2=num2-2;}
        while (num2>3);


        // Цикл for
        System.out.println("\n"+"Cycle For");
        for (int x1=1, x2=2; x1<=10 && x2<=10; x1++, x2=x2+2 ){
            System.out.println("x1="+ x1+"; x2="+x2);
        }

    }

}
