package student_elizabete_ket.homework.lesson_3.level_5;

class Dog {
    private String name = "Mailo";
    private int age;
    private String dogColour;
    private String dogNewColor;


    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getDogColour() {
        return dogColour;
    }

    public void setDogColour (String dogColour) {
        this.dogColour = dogColour;
    }



    public void voice () {
        System.out.println(name + "! " + name + "! " + name + "!");
    }

    public void voice2() {
        System.out.println("Dog`s name is " + name + " and he is " + age + " years old" + " and " +
         name +"`s colour is " + dogColour);
    }

    public int dogAge (int ageToAdd) {
        this.age = this.age + ageToAdd;
        return this.age;
    }

    public void happyBirthday() {
      System.out.println("My name is " + name + ", and today is my birthday, now I`am " + age + " years old");
    }

    public String getDogNewColor () {
        return dogNewColor;
    }

    public void changeColor(String dogNewColor) {
        this.dogColour = dogNewColor;
        System.out.println("My name is " + name);
        System.out.println("My new colour is " + dogNewColor);
        System.out.println("My name is " + name + " and my new color is " + dogNewColor);
    }
}
