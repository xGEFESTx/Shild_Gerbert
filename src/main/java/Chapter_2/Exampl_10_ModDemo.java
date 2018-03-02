package Chapter_2;

public class Exampl_10_ModDemo {
    public static void main(String[] args) {
        int iresult, irm;
        double dresult, drem;

        iresult = 10 / 3;
        irm = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Результат и остаток от деления 10/3: " + iresult + " " + irm);
        System.out.println("Результат и остаток от деления 10.0/3.0: " + dresult + " " + drem);
    }
}
