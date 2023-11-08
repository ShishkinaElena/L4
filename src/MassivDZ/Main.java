package MassivDZ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int[] arr = new int[50];
        Random random = new Random();

        for (int i = 0; i <arr.length; i++) { // arr.length это длина массисва
            arr[i] = random.nextInt(101) - 50; // не понятно от куда взялось (101) - 50

        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Массив: " + Arrays.toString(arr)); // Метод Arrays.toString(имя)  увидеть значения, которые есть в массиве

        int negative = 0;
        int positive = 0;
        int zero = 0;
        for(int i : arr) {
            if(i < 0) {
                negative++; //количество отрицательных элементов
            }
            if(i > 0) {
                positive++; //количество положительных элементов
            }
            if (i==0){
                zero++; // количество нулей
                try {

                } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException – это исключение,
                    // когда мы пытаемся обратиться к элементу массива по отрицательному или превышающему размер массива индексу.
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
        // выведем результат в консоль
        System.out.println("Кол-во отрицательных элементов: " + negative);
        System.out.println("Кол-во положительных элементов: " + positive);
        System.out.println("Кол-во 0: " + zero);
                scanner.close();


    }
}
