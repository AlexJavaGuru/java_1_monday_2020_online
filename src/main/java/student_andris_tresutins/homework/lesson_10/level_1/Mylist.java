package student_andris_tresutins.homework.lesson_10.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface Mylist {

    void addItem(Object object); //Adds an item

    void removeItem(Object object); // Removes an item

    void getItemIndex(Object object); // Returns item index

    void removeAllItems(Mylist mylist); // clears the array

    void editItemIndex(int index, Object object); // Replaces an item index with a specified index

    void getSize(Mylist mylist); // Returns the size of array


}
