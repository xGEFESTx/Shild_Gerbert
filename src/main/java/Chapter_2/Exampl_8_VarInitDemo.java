package Chapter_2;

public class Exampl_8_VarInitDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int y = -1; // переменная инициализируется при каждом входе в блок
            System.out.println("y: " + y);
            y = 100;
            System.out.println("Изминенное значение y: " + y);
        }
    }
}
