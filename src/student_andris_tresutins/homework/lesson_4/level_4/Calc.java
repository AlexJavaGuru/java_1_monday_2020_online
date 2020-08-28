package student_andris_tresutins.homework.lesson_4.level_4;

class Calc {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    //Данный метод, не делает ту работу, которую вы задумывали в названии. Он просто возвращает остаток от деления. Необходимо добавить логику, чтобы возвращался boolean true - если четное число.
    public int iseven(int firstNumber) {
        if (firstNumber % 2 == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //Для чего тут 3-ий аргумент?
    public int isbiggerTwoInt(int firstNumber, int secondNumber) {

      if(firstNumber > secondNumber){
          return firstNumber;
      } else if(firstNumber < secondNumber){
          return secondNumber;
      } else  {
          return 0;
      }
    }

    //Вы перемудрили с логикой. Зачем столько аргументов? Просто подавате 3 аргумента (3 числа).
    public int isbiggerThreeInt(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber == secondNumber && secondNumber > thirdNumber){
            return 12;
        }
        else if(firstNumber == secondNumber && secondNumber < thirdNumber){
            return 3;
        }
        else if(firstNumber > secondNumber && firstNumber > thirdNumber ){
            return firstNumber;
        }
        else if(firstNumber < secondNumber && secondNumber > thirdNumber){
            return secondNumber;
        }
        else if(firstNumber < thirdNumber && secondNumber < thirdNumber ){
            return thirdNumber;
        }
        else if(firstNumber == secondNumber && secondNumber == thirdNumber){
            return 123;
        }
        else{
            return 0;
        }
    }




    }

