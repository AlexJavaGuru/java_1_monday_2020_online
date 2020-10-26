package student_artur_martinenko.homework.lesson_8.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {
    private String author;
    private String name;
    private int pagesQTY;

    public Book(String author, String name, int pagesQTY) {
        this.author = author;
        this.name = name;
        this.pagesQTY = pagesQTY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }
        Book book = (Book) obj;
        if (this.getAuthor().equalsIgnoreCase(book.getAuthor())) {
            return this.getName().equalsIgnoreCase(book.getName());
        }
        return false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesQTY() {
        return pagesQTY;
    }

    public void setPagesQTY(int pagesQTY) {
        this.pagesQTY = pagesQTY;
    }
}
