package Chapter_1;

public class Task_2_GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters, k;
        k = 3.7854;

        for (gallons = 1; gallons <= 100; gallons++){
            liters = gallons * k;
            System.out.println(gallons + " галонах " + liters + " литров");
            if (gallons % 10 == 0){
                System.out.println();
            }
        }
    }
}
