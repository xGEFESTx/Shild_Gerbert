package Chapter_2;

public class Exampl_1_Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;



        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
