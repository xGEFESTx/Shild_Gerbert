package Chapter_2;

public class Exampl_9_NestVar {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count++){
            System.out.println("Значение count: " + count);

            //int count;  // ОШИБКА!!!
            for (count = 0; count < 2; count ++){  //повторно инициализируется переменная count что приводит к бесконечному циклу
                System.out.println("В этой программе есть ошибка!");
            }
        }
    }
}
