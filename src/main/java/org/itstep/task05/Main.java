package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();

        try {
            runner.halt();
        } catch (RuntimeException e){
            System.err.println("halt;");
        }
        //IOException является проверяемым исключением и выбросится автоматически, если в сигнатуре метода оно присутствует
        /*catch (IOException e){
            throw e;
        }
        */
    }
}
