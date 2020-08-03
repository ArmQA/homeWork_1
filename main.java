package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 4;
        int bottle_1 = 0;
        int bottle_2 = 0;
        if (c==a || c==b) {

            System.out.println("Mission Complete");
        }

        if (a==b && a!=c) {

            System.out.println("fail");
        }

        if (c > a && c > b) {
            System.out.println("fail");

        }

        for (int i = 0; i < 100; i++) {
            bottle_1 = a;
            bottle_2 = bottle_2 + bottle_1;
            bottle_1 = bottle_2 - bottle_1;
            System.out.println(bottle_1 + "," + bottle_2);
            if (bottle_1 == c || bottle_2 == c) {
                System.out.println("Mission Complete");
                break;
            }
            if (bottle_2 > b) {
                bottle_2 = bottle_2 - b;
                bottle_1 = bottle_1 - bottle_2;
                System.out.println(bottle_1 + "," + bottle_2);
            }
        }


    }
}