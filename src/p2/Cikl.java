package p2;

public class Cikl {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) { // i<10 - это условие, i++ прибавляет единицу/ можно написать i=i+1
            System.out.println("Hello" + i); // 9 раз Hello
        }
        for (int i = 1; i < 10; i=i+2) { // i<10 - это условие,  прибавляет 2 i=i+2
            System.out.println("Hello" + i); // 5 раз Hello
        }
       int i=1;
       for(;i<9;){
         System.out.println("Test"+(i*i)); // нет переменной отсутствуют условие прекращение, бесконечно зацикливание
        i++;
        }
System.out.println(i);
       while (i>0){
           System.out.println(i);
           i--;  // крутит в обратную сторону от 9 до 1
       }

               while (true){// удобно делать так же бесконечным
                   System.out.println("test");
                   break; // если это слово брейк, то цикл прекращается

               }
        while (true){// удобно делать так же бесконечным
            System.out.println("test");
            i++;
            if (i==5) break; // проверит 5 раз

        }

        for (int j=0; j<20;j++){
            if (j==10) continue; // цыфру 10 пропустит в итоге, завершает текущую операцию, а цикл дальше продолжается
            System.out.println(j);
        }
        int n=-1;
        do {
            System.out.println(n);
            n--;
                    } while (n>0);
    }
}