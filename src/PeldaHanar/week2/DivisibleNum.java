package PeldaHanar.week2;

public class DivisibleNum {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.println(i + "DivisibleBy15" );


            } else if (i % 5 == 0) {
                System.out.println(i + "DivisibleBy5");


            } else if (i % 3 == 0) {
                System.out.println(i  + "DivisibleBy3");
            }
        }

    }

}

