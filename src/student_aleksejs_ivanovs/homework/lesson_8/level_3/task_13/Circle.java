package student_aleksejs_ivanovs.homework.lesson_8.level_3.task_13;

class Circle extends Figure{

    private float radius;
    private float pi;

    Circle(float x, float y, float radius, float pi){
        super(x,y);
        this.radius = radius;
        this.pi = pi;
    }

    public float getPerimeter(){
        return radius * 2 * pi;
    }

    public float getArea(){
        return radius * radius * pi;
    }

}
