package student_renars_ranka.homework.lesson_2.level_2;
//TODO: Очень трудно читать класс. Метод setBook должен быть правильно отформатирован. что такое b? из названия переменной не понятно совсем...
class Book {
    private String book;
    public void setBook (String b) {book = b;}
}
public class Task_3 {
    public static void main (String [] args) {
        //Почему создание объекта в одну строку с инициализацией состояний? После ; ничего не должно быть в строке, когда мы пишем на Java.
//        Book book1 = new Book();
//        book1.setBook("Java 7");
        Book book1 = new Book ();
            book1.setBook ("Java 7");

        Book book2 = new Book ();
            book2.setBook ("Java 7");
        if (book1.equals (book2)) {
            System.out.println ("True");
        } else {
            System.out.println ("False");
        }
    }
}

