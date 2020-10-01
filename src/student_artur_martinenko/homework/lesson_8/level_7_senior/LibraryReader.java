package student_artur_martinenko.homework.lesson_8.level_7_senior;

import teacher.annotations.CodeReview;

import java.text.SimpleDateFormat;
import java.util.Date;

@CodeReview(approved = true)
class LibraryReader {

    private String name;
    private String lastName;
    private Date dateOfBirth;

    public LibraryReader(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        LibraryReader reader = (LibraryReader) obj;
        if (dateOfBirth.compareTo(reader.getDateOfBirth()) == 0) {
            return this.getLastName().equalsIgnoreCase(reader.lastName);
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        return "Name = " + name +
                ", LastName = " + lastName +
                ", DateOfBirth = " + ft.format(dateOfBirth);
    }
}
