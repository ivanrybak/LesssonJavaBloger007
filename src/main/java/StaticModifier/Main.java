package StaticModifier;

import static StaticModifier.Man.cap;

/*модификатор доступа static
Модификатор static в Java напрямую связан с классом. Если поле статично,
 значит оно принадлежит классу, если метод статичный — аналогично: он принадлежит классу.
 Исходя из этого, можно обращаться к статическому методу или полю, используя имя класса, не сождавая самого объекта класса.*/
public class Main {
    public static void main (String [] args){
        Man man1=new Man();
        man1.head();
        man1.body();   //вызываем методытело и голова, создав объект человек (man1)
        Man.shoes();   // static метод шапка можем вызвать без объекта, обратившись к классу (Man)
        cap();         //static метод шапка вызываем одним словом cap(), импортировав модификатор метода класса Man
        // import static StaticModifier.Man.cap;

    }
}

