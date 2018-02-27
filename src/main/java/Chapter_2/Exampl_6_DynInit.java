package Chapter_2;

public class Exampl_6_DynInit {
    public static void main(String[] args) {
        double radius =4, height = 5;

        double volume = 3.1416 * radius * radius * height; //переменная volume инициализируется динамически
        System.out.println("Обьем: " + volume);
    }
}
