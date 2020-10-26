package student_regina_svistunov.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {

    private String model;
    private String sizeOfMemory;
    private String color;

    Phone (String model, String sizeOfMemory, String color) {
        this.model = model;
        this.sizeOfMemory = sizeOfMemory;
        this.color = color;
    }

    String getModel() {
        return model;
    }
    String getSizeOfMemory() {
        return sizeOfMemory;
    }
    String getColor() {
        return color;
    }
    public void voice () {
        System.out.println(" Phone model is " + model + ".");
        System.out.println( model + " size of memory is " + sizeOfMemory + ".");
        System.out.println( model + " is a " + color + " color.");
    }
}
