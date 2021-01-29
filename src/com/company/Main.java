package com.company;

//import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] number = {1.0, 2.0, 4.0, -6.0, -3.0, 3.0, 5.0, 1.0, -3.0, 2.0, 1.0, -4.0, 8.0, 1.0};
        double summa = 0;
        double result = 0;
        boolean negativeNum = false;
        int truenum = 0;
        for (int i = 0; i < number.length ; i++) {

        }
        for (double number1: number) {
            if (number1 < 0){
                negativeNum = true;
            }
            if(negativeNum) {
                if (number1> 0 ){
                    truenum = truenum +1;
                    summa= summa + number1;
                    result= summa / truenum;
                }
            }

        }
        System.out.println(Arrays.toString(number));
        System.out.println(summa/ truenum);
        sortNumber(number);

        System.out.println(Arrays.toString(number));


    }
    public static void sortNumber(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            double minValue = arr [i];
            for (int j = i; j <arr.length ; j++) {
                if (minValue> arr[j]){
                    double d = minValue;
                    minValue = arr[j];
                    arr[j] = d;
                }

            }
            arr[i] = minValue;

        }
    }


}

