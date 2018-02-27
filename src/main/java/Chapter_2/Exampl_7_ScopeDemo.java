package Chapter_2;

public class Exampl_7_ScopeDemo {
    public static void main(String[] args) {
        int x; // переменная доступна для всео кода в методе main;
        x = 10;
        if (x ==10) {       //начало новой области видимости
            int y = 20;     //Эта переменная доступна только в данном блоке
            System.out.println("x and y: " + x + " and " + y);
            x = y *2;
        }
        // y = 100  // ОШИБКА! в этом месте переменная у недоступна

        System.out.println("x is: " + x);
    }
}
