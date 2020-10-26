package student_artur_martinenko.homework.lesson_10.level_1_intern.task_3;

/*
Создаём интерфейс для структуры данных список.

Массив в Java это хорошая структура данных для хранения примитивных типов данных
или ссылок на объекты. Но у массива есть много ограничений. Например длинну массива
нельзя изменить после его создания.

В этом задании предлагается создать интерфейс для структуры данных список.
Структура данных список - это тот же массив, только без ограничений!
Придумайте каких операций вам не хватает в массиве. Для каждой операции
создайте свой метод в интерфейсе MyList и опишите словами, что этот метод должен
делать в коментарии к методу.

Не подсматривайте имплементацию java.util.List и тому подобных интерфейсов и классов.

Цель этого задания самостоятельно разработать свой интерфейс MyList.
 */
interface MyList {

    //these methods can be the same for primitive types

    void addToArray(Object o); //to add an object to an array

    void removeFromArray(Object o); //removing object from an array

    boolean ifPresentInArray(Object o); //checking if the object is present in an array

    boolean ifObjectsAreEqual(Object o, Object object); //if the objects are equal

    int returnIndexPosition(Object o); //returning an index position of object

    Object returnObjectWithIndexPosition(int index); //returning an object with given index position

    boolean ifArrayIsEmpty();   //returning true or false if array is empty or not
}
