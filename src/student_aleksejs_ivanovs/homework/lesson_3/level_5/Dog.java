package student_aleksejs_ivanovs.homework.lesson_3.level_5;

//Все хорошо, только хотел уточнить, что в методах
//public String getDogName() {
//  return this.dogName;
//}
//Нам необязательно писать слово this.
//Внутри этого метода, нету конфликта имен, так что джава без проблем понимает, какой именно dogName ей надо вернуть
class Dog {

    public String dogName;
    public int dogAge;
    public String dogColour;

    public Dog(String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    public String getDogName() {
        return this.dogName;
    }

    public int getDogAge() {
        return this.dogAge;
    }

    public void happyBirthday() {
        dogAge = this.dogAge +1;
        System.out.println("Happy birthday me! I am " + dogAge + " years old");
    }

    public void voice() {
        System.out.println(dogName + " " + dogAge);
    }

    public void voiceOne() {
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }

    public void changeColor(String newColor) {
        this.dogColour = newColor;
    }

    public void voiceTwo() {
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }
}