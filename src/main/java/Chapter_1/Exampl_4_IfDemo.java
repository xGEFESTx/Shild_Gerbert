package Chapter_1;

public class Exampl_4_IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) {
            System.out.println("a < b");
        }

        if (a == b){
            System.out.println("a = b  Вы не должны увидеть этот текст");
        }

        System.out.println();

        c = a - b;

        System.out.println("C  содержит -1");
        if (c >= 0){
            System.out.println("C - не отрицательное число");
        }
        if (c < 0){
            System.out.println("C - отрицательное число");
        }

        System.out.println();
        c = b - a;

        System.out.println("C  содержит 1");
        if (c >= 0){
            System.out.println("C - не отрицательное число");
        }
        if (c < 0){
            System.out.println("C - отрицательное число");
        }
    }
}
