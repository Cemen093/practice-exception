package org.itstep.task03;

import org.itstep.task03.Exeption.CreateTriangleException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void checkNormalWork() {
        try {
            new Triangle(10, 10, 10);
            new Triangle(10, 10, 9);
            new Triangle(10, 20, 29);
            new Triangle(2500, 2000, 600);
            new Triangle(10, 5, 5);
        } catch (CreateTriangleException e) {
            Assert.fail();
        }
    }

    @Test
    public void checkCreateTriangleException() {
        try {
            new Triangle(31, 10, 10);
            Assert.fail("Треугольник со сторонами 31, 10, 10 построить нельзя.");
        } catch (CreateTriangleException e) {
            //
        }
        try {
            new Triangle(1000, 100, 10);
            Assert.fail("Треугольник со сторонами 1000, 100, 10 построить нельзя.");
        } catch (CreateTriangleException e) {
            //
        }
        try {
            new Triangle(25, 10, 10);
            Assert.fail("Треугольник со сторонами 25, 10, 10 построить нельзя.");
        } catch (CreateTriangleException e) {
            //
        }
        try {
            new Triangle(111, 13, 97);
            Assert.fail("Треугольник со сторонами 111, 13, 97 построить нельзя.");
        } catch (CreateTriangleException e) {
            //
        }
    }

}