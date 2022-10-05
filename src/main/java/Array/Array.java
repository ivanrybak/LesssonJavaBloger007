package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = {2, 3, 4};
        System.out.println(arr1.length);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
//программа для голосования "Какой сок вы любите больше апельсиновый или яблочный?" (для трех человек)
//создаем 2 массива в качестве варианов ответа
        int []orangeJuiсe=new int[3];
        int[]appleJuiсe=new int[3];
        int answer;
        System.out.println("which juice do you like more? orange press 1, apple press 2");
        Scanner scr=new Scanner(System.in);
        answer=scr.nextInt();
        if(answer==1){
            orangeJuiсe[0]=1;
        }else if (answer==2){
            appleJuiсe[0]=1;
        }else {
            System.out.println("incorrect input");
        }
        System.out.println("which juice do you like more? orange press 1, apple press 2");
        Scanner scr1=new Scanner(System.in);
        answer=scr1.nextInt();
        if(answer==1){
            orangeJuiсe[1]=1;
        }else if (answer==2){
            appleJuiсe[1]=1;
        }else {
            System.out.println("incorrect input");
        }
        System.out.println("which juice do you like more? orange press 1, apple press 2");
        Scanner scr2=new Scanner(System.in);
        answer=scr.nextInt();
        if(answer==1){
            orangeJuiсe[2]=1;
        }else if (answer==2){
            appleJuiсe[2]=1;
        }else {
            System.out.println("incorrect input");
        }



        int sum1=0;
        for (int i=0; i<orangeJuiсe.length;i++){
            sum1=sum1+orangeJuiсe[i];
        }  int sum2=0;
        for (int i=0; i<appleJuiсe.length;i++){
            sum2=sum2+appleJuiсe[i];
        }
        System.out.printf("Orange juice selected: %d people, Apple juice selected: %d people",sum1,sum2);
    }

}
