package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
    }

    public void readXml(XmlReader[] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i].read();
            }catch (FileSystemAlreadyExistsException e){
                throw new FileNotFoundException();
            }
            //Вот тут я не понял
            // "который принимает массив объектов данного класса, и вызывает у каждого объекта метод read()"
            //Это как? Он же после первого объэкта в массиве всё. Я же не обрабатываю ни одного исключения на месте.
            //Даже FileSystemAlreadyExistsException и то перекидывает исключение вверх, хоть и другое.
            //Как мне пройти по всему массиву (дальше первого) уже после исключения переброшеного наверх?
        }
    }
}
