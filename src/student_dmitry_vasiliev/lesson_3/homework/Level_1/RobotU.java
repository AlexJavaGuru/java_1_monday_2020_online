package student_dmitry_vasiliev.lesson_3.homework.Level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Очень плохо с форматом. Посмотрите на класс. Почему в теле класса, строчки находятся не на одинковом отступе?" +
        "sayHello1 плохое название. Но это не критично для задачи.")
public class RobotU {

        public String name;

        public RobotU(String name)
        {
            this.name = name;
        }

        public RobotU() {

        }
    public void sayHello1()
    {
        System.out.println("Hello!!!");
    }
        public void sayHello()
        {
            System.out.println("Hello from " + name);
        }

        public void sayYourName()
        {
            System.out.println("My name is " + name); // == this.name

        }
    }

