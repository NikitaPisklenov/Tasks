package Homeworks.loops8;

public class Task2 {
    public static void main(String[] args) {

        int startingNumber = 9;
        int endingNumber = 999;
        int sumOfInts = 0;

        for (int i  = startingNumber; i<=endingNumber; i++ ) {
                sumOfInts = 0;
            for (int b=1; b<i; b++) {
                if (i%b == 0) {
                    sumOfInts = sumOfInts + b;
                }
            }
            if (i==sumOfInts) {
                System.out.println(sumOfInts);
            }

        }

    }
}
