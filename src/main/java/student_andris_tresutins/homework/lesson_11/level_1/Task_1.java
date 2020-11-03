package student_andris_tresutins.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Task_1 {
    public static void main(String[] args) {
        //Array list Implements all optional list operations, and permits all elements, including null.
        ArrayList<Integer> list = new ArrayList<>();

        // Vector. the size of a Vector can grow or shrink as needed to accommodate adding and removing
        // items after the Vector has been created
        Vector<Integer> listTwo = new Vector<>();

        // Linked List
        // Doubly-linked list implementation of the List and Deque interfaces.
        // Implements all optional list operations, and permits all elements (including null).
        LinkedList<Integer> listThree = new LinkedList<>();

        // Stack
        // It extends class Vector with five operations that allow a vector to be treated as a stack.
        // The Stack class represents a last-in-first-out (LIFO) stack of objects.
        Stack<Integer> listFour = new Stack<>();
    }
}
