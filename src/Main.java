public class Main {
    public static void main(String[] args) {
        //HomeworkOne1
        //Task1
        double sum = 0;
        int month = 0;

        while (sum <= 2_459_000) {
            sum += 15_000 + (sum * 0.01);
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");

        }
        System.out.println();
        //Task2
        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        i--;
        System.out.println();

        for (; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println();
        //Task3
        int Y = 12_000_000;
        int year = 1;
        int fertility = 17;
        int mortalityRate = 8;

        for (; year <= 10; year++) {
            Y = (Y / 1000) * fertility + (Y / 1000) * mortalityRate + Y;
            System.out.println("Год " + year + ",численность населения составляет " + Y + ".");
        }
        System.out.println();
        //HomeworkTwo
        //Task1
        double summ = 0;
        int month1 = 1;

        while (summ <= 12_000_000) {
            summ = 15_000 + (summ * 0.07 + summ);
            System.out.println("Месяц " + month1 + " ,сумма накоплений равна " + summ + " рублей");
            month1++;
        }

        System.out.println();
        //Task2
        double sum1 = 0;
        int month2 = 1;

        while (sum1 <= 12_000_000) {
            sum1 = 15_000 + (sum1 * 0.07 + sum1);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " ,сумма накоплений равна " + sum1 + " рублей");
            }
            month2++;
        }
        System.out.println();
        //Task3
        double sum2 = 15000;
        int month3 = 1;
        double rate = 0.07;

        while (month3 <= 108) {
            sum2 = 15_000 + (sum2 * rate + sum2);
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " ,сумма накоплений равна " + sum2 + " рублей");
            }
            month3++;
        }
        System.out.println();
        //Task4
        int monthOne = 31;
        int day;

        for (day = 5; day <= monthOne; day = day + 7) {
            System.out.println("Сегодня пятница," + day + " число.Необходимо подготовить отчет.");
        }
        System.out.println();
        //HomeworkThree
        //Task1
        int century = 2122;
        int twoHundredYears = 1822;
        int yearCameta;
        for (yearCameta = 79; yearCameta <= century; yearCameta += 79) {
            if (yearCameta >= twoHundredYears) {
                if (yearCameta % 79 == 0) {
                    System.out.println(yearCameta);
                }
            }
        }
        System.out.println();
        //Task2
        int two = 2;
        for (int multiplication = 1; multiplication <= 10; multiplication++) {
            int sumi = two * multiplication;
            System.out.println(two + "*" + multiplication + "=" + sumi);
        }

    }

}