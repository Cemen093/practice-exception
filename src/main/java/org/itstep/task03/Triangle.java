package org.itstep.task03;

import org.itstep.task03.Exeption.CreateTriangleException;

public class Triangle {
    private final int sizeA;
    private final int sizeB;
    private final int sizeC;

    public Triangle(int sizeA, int sizeB, int sizeC) throws CreateTriangleException {
        if (((sizeA + sizeB) < sizeC) || ((sizeA + sizeC) < sizeB) || ((sizeC + sizeB) < sizeA)){
            throw new CreateTriangleException("Нельзя построить треугольник со сторонами " +
                    sizeA + ", " + sizeB + ", " + sizeC);
        }

        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }
}
