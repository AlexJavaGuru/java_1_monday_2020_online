package student_renars_ranka.homework.lesson_3.level_3;

class Book {

    private String title;

    public Book(String bookTitle) {

        this.title = bookTitle;
    }

    public String getTitle() {

        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
