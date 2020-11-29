package org.itstep;

import org.junit.Assert;

import java.lang.reflect.Modifier;

import static java.lang.reflect.Modifier.*;

public class TestUtil {

    public static void isPublicNoStaticNoFinalNoAbstractClass(Class<?> clazz, String className) {
        Assert.assertNotNull("Класс " + className + " не найден",clazz);
        Assert.assertTrue("Класс " + className + " должен быть публичным", (clazz.getModifiers() & PUBLIC) > 0);
        Assert.assertFalse("Класс " + className + " не должен быть final", (clazz.getModifiers() & FINAL) > 0);
        Assert.assertFalse("Класс " + className + " не должен быть abstract", (clazz.getModifiers() & ABSTRACT) > 0);
        Assert.assertFalse("Класс " + className + " не должен быть interface", (clazz.getModifiers() & INTERFACE) > 0);
    }
}
