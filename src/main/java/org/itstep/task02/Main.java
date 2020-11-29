package org.itstep.task02;

import org.itstep.task02.Exception.GreatHundredException;
import org.itstep.task02.Exception.NegativeNumberException;

public class Main {
    public static void main(String[] args) {
    }

    public static void getPositiveLessHundredNumber(int num) throws NegativeNumberException, GreatHundredException {

        if (num < 0){
            throw new NegativeNumberException("число отрицательное");
        }

        if (num > 100){
            throw new GreatHundredException("число больше 100");
        }
    }
}
