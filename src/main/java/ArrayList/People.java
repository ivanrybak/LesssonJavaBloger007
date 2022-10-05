package ArrayList;
import java.util.ArrayList;
public class People {
    public static void main (String [] args){

        ArrayList<String>people=new ArrayList<String>(); //создали строковый массив people
        people.add(0,"Anna");               //добавили в него людей
        people.add("Olga");
        people.add("Masha");
        people.add("Katya");
        System.out.println("Вывод одного объекта массива под индексом(0) people.get(0) "+ "\n" +people.get(0) );
        System.out.println("Всего объектов: "+people.size());
        people.set(1,"Liza");                             //заменили ольгу лизой
        for (int i=0; i<people.size(); i++)             //цикл for для вывода каждого объекта массива
            System.out.println(people.get(i));
        System.out.println("Object (0): "+people.get(0));     //вывели первый объект массива под индексом (0)
         people.remove(1);                          //удалили объект под индексом (1)
        System.out.println("\n one more time");

        int index=-1;
        for (int i=0; i<people.size(); i++){    //снова вывели все элементы массива + индекс каждого
            index=index+1;
            System.out.println(people.get(i)+" -  "+index);}

        System.out.println("Всего объектов: "+people.size());

        System.out.println("Индекс маши в массиве: "+people.indexOf("Masha"));      //вывод индекса объекта маша в массиве people
      //чтобы вывести не индекс а порядковый номер объекта, создаем интовую переменную и присваеваем ей значение индекса +1
        int numPeople=people.indexOf("Masha")+1;
        System.out.println("Порядковый номер Маши: " +numPeople);
        people.clear();
        people.remove("Masha");
        System.out.println("Удалили объект \"Masha\" методом people.remove(\"Masha\");");

   }
}
