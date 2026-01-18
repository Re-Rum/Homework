public class Main {
    public static void main(String[] args) {
//        Задание 1.
        int numInt = 0;
        byte numByte = 1;
        short numShort = 2;
        long numLong = 3L;
        float numFloat = 4.0F;
        double numDouble = 5.0;

        System.out.println("Значение переменной numInt с типом int равно " + numInt);
        System.out.println("Значение переменной numByte с типом byte равно " + numByte);
        System.out.println("Значение переменной numShort с типом short равно " + numShort);
        System.out.println("Значение переменной numLong с типом long равно " + numLong);
        System.out.println("Значение переменной numFloat с типом float равно " + numFloat);
        System.out.println("Значение переменной numDouble с типом double равно " + numDouble);
//        Задание 2.
        byte countBananas = 5;
        short countMilk = 200;
        byte countIceCream = 2;
        byte countEgs = 4;

        byte courseBananas = 80;
        float courseMilk = 1.05F;
        byte courseIceCream = 100;
        byte courseEgs = 70;

        System.out.printf("%f Гр. или %f Кг. \n", (float) (countBananas * courseBananas) + (float) countMilk * courseMilk + (float) (countIceCream * courseIceCream) + (float) (countEgs * courseEgs), ((float) (countBananas * courseBananas) + (float) countMilk * courseMilk + (float) (countIceCream * courseIceCream) + (float) (countEgs * courseEgs)) / 1000.0F);
//        Задание 3.
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        System.out.println("Маша теперь получает " + salaryMasha * 1.1 + " рублей. Годовой доход вырос на " + (salaryMasha * 1.1 * 12.0F - (salaryMasha * 12)) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis * 1.1 + " рублей. Годовой доход вырос на " + (salaryDenis * 1.1 * 12.0F - (salaryDenis * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina * 1.1 + " рублей. Годовой доход вырос на " + (salaryKristina * 1.1 * 12.0F - (salaryKristina * 12)) + " рублей");
    }
}