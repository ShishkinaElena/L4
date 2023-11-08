package HM2dop;

import java.util.Scanner;

public class Main {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.print("Нажмите для выбора соответственно '+' '-' '*' '/' число от 1 до 4 : ");
            int c = scanner.nextInt();



            int number = c;
            if(c==1){
                System.out.println("Сумма= " + (a+b) );
            }else if (c==2){
                System.out.println("Разность = " + (a-b));
            }else if (c==3){
                System.out.println("Произведение = " + (a*b));
            }else if (c==4){
                System.out.println("Частное = " + ((double)a/b));
            }


          /*  switch (number) {
                case 1:
                    System.out.println("Сумма= " + (a+b) );
                    break;
                case 2:
                    System.out.println("Разность = " + (a-b));
                    break;
                case 3:
                    System.out.println("Произведение = " + (a*b));
                    break;
                case 4:
                    System.out.println("Частное = " + ((double)a/b));
                    break;
                default:
                    System.out.println("I don't know");
            }*/


            scanner.close();


        /*ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
        Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
        Вывести результат действия. Используйте конструкции if -else, case.*/





        }




}
