package org.itstep.task01;
import org.itstep.task01.Exception.*;
import org.junit.Assert;
import org.junit.Test;

import static org.itstep.TestUtil.isPublicNoStaticNoFinalNoAbstractClass;
import static org.junit.Assert.assertTrue;

public class ListTest {

    public static final String CLASS_NAME = "org.itstep.task01.List";

    public static final Class<?> LIST_CLAZZ;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(CLASS_NAME);
        } catch (ClassNotFoundException ex) {
            cls = null;
        }
        LIST_CLAZZ = cls;
    }


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void classExists() {
        isPublicNoStaticNoFinalNoAbstractClass(LIST_CLAZZ, CLASS_NAME);
    }

    @Test
    public void addException(){
        List list = new List(1);

        try {
            list.add(1);
        } catch (FullListException e) {
            Assert.assertNull(e);
        }

        try {
            list.add(1);
        } catch (FullListException e) {
            Assert.assertNotNull(e);
        }

    }

    @Test
    public void removeLastException() throws FullListException {
        List list = new List(1);
        list.add(1);

        try {
            list.removeLast();
        }catch (EmptyListException e){
            Assert.assertNull(e);
        }

        try {
            list.removeLast();
        }catch (EmptyListException e){
            Assert.assertNotNull(e);
        }
    }

}