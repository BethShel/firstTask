package ru.dataart.academy.java;

import static java.lang.Math.abs;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber){
        int save=inputNumber;
        int result=0;
        while(inputNumber!=0){
            result=result*10+abs(inputNumber)%10;
            inputNumber/=10;
        }
        if(save<0)
            result=0-result;
        return result;
    }
}
