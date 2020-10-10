package student_aleksejs_ivanovs.homework.lesson_8.level_3.task_13;

class Rectangle extends Figure{

    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){
        return width * 2 + height * 2;
    }

    public float getArea(){
        return width * height;
    }
}
