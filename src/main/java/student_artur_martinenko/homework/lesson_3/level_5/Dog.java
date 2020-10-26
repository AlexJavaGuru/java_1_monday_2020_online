package student_artur_martinenko.homework.lesson_3.level_5;

class Dog {
    private final String nickName;
    private int age;
    private Colors color;

    public enum Colors{
        Red,
        Green,
        Black,
        White
    }

    public Dog(String nickName, int age, Colors color) {
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    private void addOneYear(){
        this.age += 1;
    }

    public void voice(){
        for(int i = 0; i <= 2; i++) {
            System.out.println("My name is " + getNickName() + ", I'm " + this.color + " dog and " + age + " years old.");
        }
    }

    public void happyBirthday(){
        addOneYear();
    }

    public void changeColor(Colors color){
        this.color = color;
    }


}
