package Classes;

public class Animal {
    public static void main (String []args){
        Fish fish1=new Fish();
        Fish fish2=new Fish();

        System.out.println(fish1.tell+" "+fish1.name+ " i have "+fish1.fins+" fins"+" and "+fish1.teil+ " tail" );
        fish1.dive(20)  ;

        System.out.println(fish2.tell+" "+fish2.name2+ " i have "+fish2.fins+" fins"+" and "+fish2.teil+ " tail" );
        fish2.dive(30);



        //методы. создаются и принадлежать конкретному классу,вызываются в главном классе
        // строение метода: модификатор тип имя метода (параметры){тело}

        fish1.fishName();
        System.out.println(fish1.name);



        int fish2Length = fish1.lengthFish(1200);
        System.out.println("Length "+ fish2.name2+" "+ fish2Length+" centimeters");

        if (fish2Length<=100){
            System.out.println(fish2.name2+ " is small" );
        } else if (fish2Length>100 && fish2Length<=500){
            System.out.println("This "+fish2.name2+ " is average");
        }else if (fish2Length>500 && fish2Length<=1000){
            System.out.println("This "+fish2.name2+ " is big");
        }else {
            System.out.println("This is impossible");
        }
    }
}
