package Homeworks.loops8;

public class Task1 {


    public static void main(String[] args) {
        //Test Data :
        //Input the number of terms : 5
        //Expected Output :
        //1 + 11 + 111 + 1111 + 11111
        //The Sum is : 12345

        int inputNum = 5;
        int numberOne = 1;
        int totalsum = 0;

        for (int i = 1; i<=inputNum; i++) {

            if(inputNum>i) {
                System.out.print(numberOne+"+");
            }else {
                System.out.print(numberOne+"=");
            }

            totalsum += numberOne;
            numberOne = numberOne*10 +1;

        }
        System.out.print(totalsum);
    }
}
