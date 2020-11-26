# Практика на исключения

## Задание 1

Есть класс `List` (см. пакет [org.itstep.task01](src/main/java/org/itstep/task01)):

```
public class List {
	private Object[] obj;
	private int size = -1;
	private int cur = -1;
	
	public List(int size) {
		cur = 0;
		this.size = size;
		obj = new Object[size];
	}
	
	public Object get(int idx) {
		return obj[idx];
	}
	
	public void add(Object item) {			
		obj[cur++] = item;
	}

	public void removeLast() {			
		obj[--cur] = null;			
	}	
}
```

1. Создать классы `ListException`, `EmptyListException` и `FullListException`:

    * `ListException` является прямым наследником класса `Exception`
    * `EmptyListException` производный класс от `ListException`
    * `FullListException` также производный класс от `ListException`

2. В классе `List` добавить исключительные ситуации в методы:
	
	- `removeLast()` на тот случай, если производится попытка удаления элемента
	  из пустого массива obj (исключение типа EmptyListException)
	  
	- `add()` на тот случай, если массив obj полностью заполнен данными  (исключение типа `FullListException`)  

3. Привести пример работы с классом `List`. Воспроизвести исключения `EmptyListException` и `FullListException`,
    перехватить эти исключения в блоке `try...catch` и вывести сообщения на экран

**Протестируйте методы класса `List` с помощью JUnit-тестов.**

## Задание 2

Создать статический метод `getPositiveLessHundredNumber` в классе `Main` пакета [org.itstep.task02](src/main/java/org/itstep/task02), 
принимающий на вход целое число. 

В случае, если число отрицательное, в методе должно быть брошено **проверяемое** 
`NegativeNumberException` исключение. 

Если число больше 100, должно быть брошено непроверяемое исключение `GreatHundredException`.

**Протестируйте метод с помощью JUnit-тестов.**

## Задание 3

Создать класс `Triangle` в пакете [org.itstep.task03](src/main/java/org/itstep/task03), объекты которого будут неизменяемыми.

Класс инкапсулирует в себе информацию о треугольнике на плоскости (длины каждой из его ребер). 

Длины сторон задаются в конструкторе. 

Если по заданным сторонам нельзя построить треугольник, в конструктор должно бросаться 
проверяемое исключение `CreateTriangleException`.

Примечание: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.

**Протестируйте класс с помощью JUnit-тестов.**

## Задание 4

Напишите метод [бинарного поиска](https://ru.wikipedia.org/wiki/%D0%94%D0%B2%D0%BE%D0%B8%D1%87%D0%BD%D1%8B%D0%B9_%D0%BF%D0%BE%D0%B8%D1%81%D0%BA) `binarySearch` 
 в методе `Main` пакета [org.itstep.task04](src/main/java/org/itstep/task04) для одномерного массива целых чисел.
 
В случае, если массив не отсортирован, метод должен бросать проверяемое исключение.

## Задание 5

Дан класс:

```
public class Runner {
   private static final Random rnd = new Random();
   
   public void halt() throws IOException {
       if (rnd.nextBoolean()) {
          throw new RuntimeException ();
       } else {
          throw new IOException();
       }
   }
}
```

Напишите код в методе `main()` класса `Main` пакета [org.itstep.task05](src/main/java/org/itstep/task05), который создает объекты данного класса и вызывает метод `halt()`. 
В случае, если в методе было брошено `RuntimeException`, вывести в консоль **halt**; 
в противном случае – пробросить исключение наверх.

## Задание 6

Дан класс в пакете [org.itstep.task06](src/main/java/org/itstep/task06):

```
public class XmlReader {

    private static final Random rnd = new Random();

    public void read() throws IOException {
        switch (rnd.nextInt(3)) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new Error();
            case 3:
                throw new FileNotFoundException();
            default:
                throw new FileSystemAlreadyExistsException();
        }
    }
}
```

Создайте статический метод `readXml()` в классе `Main` пакета [org.itstep.task06](src/main/java/org/itstep/task06), 
который принимает массив объектов данного класса, и вызывает у каждого объекта метод `read()`.

Если при исполнении будет брошено исключение `FileSystemAlreadyExistsException`, 
поймать исключение и бросить исключение `FileNotFoundException`.
