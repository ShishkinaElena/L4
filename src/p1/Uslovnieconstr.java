package p1;

public class Uslovnieconstr {

    public static void main(String[] args) {

        int a =200;
        int b=20;
        if(a>b) { // После if ставиться условие, если условие выполняется, то срабатывает код
            System.out.println("a>b");
        }else if (a<b) {
            System.out.println("a<b");
        }else{
            System.out.println("a=b");

        }

       int number =8;

        switch (number) {
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
            case 10:
            case 8: //  при 8 напишется что номер равен 8
                System.out.println("Number = 8");
                break; // если отключить брейк, то выполнится и дефолт
            default: // срабатывает когда не выполнились условия предыдущие, можно его вообще не писать
                System.out.println("I don't know");

        }
        int c=a<b ? (a+b) : (a-b);
        System.out.println(c);

        if (a<b) {
            c = a + b;
        }else{
            c=a-b;
        }
        System.out.println(c);

    }
}
