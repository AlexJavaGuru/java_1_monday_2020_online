package student_pjotrs_grezmanis.lesson_3.level_6;

 class Cat {

    public String name;
    public String color;
    public String hungry;

    public Cat (String name, String color, String hungry) {
        this.name = name;
        this.color = color;
        this.hungry = hungry;
    }
    public void setName(){
        System.out.println("My name is " + name);
    }
    public void setColor(){ System.out.println("My color is " + color);
    }
    public void moew(){
        System.out.println("Meow mur meow...");
    }
    public void sleep(){
        System.out.println("I want sleep always Mrrrrr...");
    }
    public void eat(String food){
        System.out.println("I'm " + hungry + " I want " + food + "!");
    }
}

