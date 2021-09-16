package Homeworks.loops8;

public class Task3 {

    public static void main(String[] args) {

        int input = 370;
        int inputValueHolder = input;
        int eachDigit = 0;
        int sumOfNewNumber = 0;

        while (input!=0) {


            eachDigit = input%10;
            input= input/10;
            //System.out.println(eachDigit);
            sumOfNewNumber = (int) (sumOfNewNumber + Math.pow(eachDigit,3));
        }
        if (sumOfNewNumber==inputValueHolder) {

            System.out.println(inputValueHolder+" is an Armstrong number");

        } else {

            System.out.println("Not an Armstrong");

        }



//        int firstDigitfromRight = input%10;
//        int secondDigitfromRight = (input%100)/10;
//        int thirdDigitFromRight = (input%1000)/100;
//        double sumOfDigitsCubed = (Math.pow(firstDigitfromRight,3)+(Math.pow(secondDigitfromRight,3)+(Math.pow(thirdDigitFromRight,3))));
//        if (input == sumOfDigitsCubed) {
//
//            System.out.println("Armstrong");



    }

}
