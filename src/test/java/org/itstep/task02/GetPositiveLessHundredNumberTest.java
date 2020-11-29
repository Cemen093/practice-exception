package org.itstep.task02;

import org.itstep.task02.Exception.GreatHundredException;
import org.itstep.task02.Exception.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;

import static org.itstep.task02.Main.getPositiveLessHundredNumber;

public class GetPositiveLessHundredNumberTest {

    @Test
    public void checkNormalWork() {

        try {
            getPositiveLessHundredNumber(0);
            getPositiveLessHundredNumber(3);
            getPositiveLessHundredNumber(17);
            getPositiveLessHundredNumber(97);
            getPositiveLessHundredNumber(100);
        } catch (NegativeNumberException e) {
            Assert.fail();
        }
    }

    @Test
    public void checkNegativeNumberException() {
        try {
            getPositiveLessHundredNumber(-1);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof NegativeNumberException);
            return;
        }
        Assert.fail();
    }

    @Test
    public void checkGreatHundredException() {
        try {
            getPositiveLessHundredNumber(101);
        } catch (Exception e) {
            Assert.assertTrue(e instanceof GreatHundredException);
            return;
        }
        Assert.fail();
    }
}