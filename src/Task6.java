import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

    /*
    Задание 6.1

    Иерархическая организационная структура компании.
    Упорядочивание информации с ее классификацией по типам (структуры данных и их связи/наследования в языке программирования)
    Хранение упорядоченных данных

     */

        TimeManager timeManager = new TimeManager();

        tasks62_65(timeManager);

        task66(timeManager);

    /*
    Задание 6.7

    Ввиду сбалансированности красно-черных деревьев и прочих сбалансированных двоичных поисковых деревьев, они
    используются для организации хранения данных в выделенных участках памяти / регистра процессора ПК при реализации
    программ в разных языках программирования.
     */

    }

    private static void task66(TimeManager timeManager) {
        MyClass myClass = new MyClass();
        int[] intArray = myClass.setNewRandomIntArray(100,50);
        int[] arrayCopy1 = Arrays.copyOf(intArray,intArray.length);
        int[] arrayCopy2 = Arrays.copyOf(intArray,intArray.length);
        int[] arrayCopy3 = Arrays.copyOf(intArray,intArray.length);
        int[] arrayCopy4 = Arrays.copyOf(intArray,intArray.length);
        int[] arrayCopy5 = Arrays.copyOf(intArray,intArray.length);

        System.out.println(Arrays.toString(intArray));

        MyHeap myHeap = new MyHeap();

        timeManager.setStartTime();
        myHeap.sort(arrayCopy1);
        timeManager.setEndTime();
        System.out.println(Arrays.toString(arrayCopy1));
        System.out.println("Сортировка кучей заняла " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        Arrays.sort(arrayCopy2);
        timeManager.setEndTime();
        System.out.println(Arrays.toString(arrayCopy2));
        System.out.println("Сортировка методом Arrays.sort() заняла " + timeManager.getRunTime() + " нс");

        MyArray myArray = new MyArray();

        timeManager.setStartTime();
        myArray.insertionSort(arrayCopy3);
        timeManager.setEndTime();
        System.out.println(Arrays.toString(arrayCopy3));
        System.out.println("Сортировка вставками заняла " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myArray.bubbleSort(arrayCopy4);
        timeManager.setEndTime();
        System.out.println(Arrays.toString(arrayCopy4));
        System.out.println("Сортировка пузырьком заняла " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myArray.selectionSort(arrayCopy5);
        timeManager.setEndTime();
        System.out.println(Arrays.toString(arrayCopy5));
        System.out.println("Сортировка выбором заняла " + timeManager.getRunTime() + " нс");
    }

    private static void tasks62_65(TimeManager timeManager) {
        Tree tree = new Tree();
        tree.insert(new Person(4,"Ivan",35));
        tree.insert(new Person(2,"Sergey",78));
        tree.insert(new Person(3,"Andrey",24));
        tree.insert(new Person(5,"Sasha",21));

        Node temp;

        System.out.println("Обход в порядке возрастанию ключей (id):");
        timeManager.setStartTime();
        tree.traverseInOrder();
        timeManager.setEndTime();
        System.out.println("Обход в порядке возрастания ключей занял " + timeManager.getRunTime() + " нс");

        System.out.println("Префиксный обход:");
        timeManager.setStartTime();
        tree.traversePreOrder();
        timeManager.setEndTime();
        System.out.println("Префиксный обход занял " + timeManager.getRunTime() + " нс");

        System.out.println("Постфиксный обход:");
        timeManager.setStartTime();
        tree.traversePostOrder();
        timeManager.setEndTime();
        System.out.println("Постфиксный обход занял " + timeManager.getRunTime() + " нс");

        System.out.println("Элемент с минимальным ключом");
        timeManager.setStartTime();
        temp = tree.min();
        timeManager.setEndTime();
        temp.display();
        System.out.println("Поиск элемента с минимальным ключом занял " + timeManager.getRunTime() + " нс");

        System.out.println("Элемент с максимальным ключом");
        timeManager.setStartTime();
        temp = tree.max();
        timeManager.setEndTime();
        temp.display();
        System.out.println("Поиск элемента с максимальным ключом занял " + timeManager.getRunTime() + " нс");

        Tree treeCopy = new Tree();
        timeManager.setStartTime();
        treeCopy.copyTree(tree);
        timeManager.setEndTime();
        System.out.println("Копирование бинарного дерева заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        treeCopy.delete(2);
        timeManager.setEndTime();
        System.out.println("Удаление элемента заняло " + timeManager.getRunTime() + " нс");
        treeCopy.traverseInOrder();
    }


}