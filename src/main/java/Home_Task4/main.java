package Home_Task4;

public class main {
    public static void main(String[] args) {


        //создать одномерный массив из  элементов и заполнить его числами от 1 до 6. Двумя способами.
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[6];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        System.out.println(array2[5] + " " + array[0]);
        //вывод всех элементов массива
        for (int i = 0; i < array2.length; i++) {
            System.out.println();
        }
        //вывод всех элементов массива в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Элемент массива с индексом [\"Элемент массива с индексом [\" + i + \"] равен \" + array2[i]" + i + "] равен " + array[i]);
            //    System.out.print(array[i]);
        }
        //вывести сумму всех элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива равна =" + sum);
        //вывести все четные элементы массива
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            if (num % 2== 0) {
                System.out.println("Элемент массива с индексом [" + i + "] равен " + array2[i]);
            }

        }
    }

}
