package p3;

public class Massiv{
    public static void main(String[] args){
        int mas[];
        int[] arr = new int[10]; // обозначение массива два варианта

        arr [0] =10;
        arr [1] =20;

        for (int i=0; i<arr.length; i++){ // arr.length это длина массисва

            arr[i] = i ; // лежит 5 в каждом
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] massiv = {1,2,3,4,5};
        int[] massiv2 = new int[5] ; // в этом случае по умолчанию 0 массив, напечатает 5 нулей
        System.out.println(massiv); // ответ [I@3feba861 , т.к. massiv объект

        for (int i =0 ; i<massiv2.length; i++) {
            System.out.print(massiv2[i] + "");
        }

            String[] arrStr = new String[5]; // ответ null  String это непримитивный вид

            for (int i=0; i<arrStr.length; i++){
                System.out.println(arrStr[i]);
        }
    }


}
