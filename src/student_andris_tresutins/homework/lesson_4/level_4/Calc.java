package student_andris_tresutins.homework.lesson_4.level_4;

class Calc {

    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public int iseven(int firstNumber) {

        return firstNumber % 2;
    }

    public int isbiggerTwoInt(int firstNumber, int secondNumber, int irrelevantNumber) {

      if(firstNumber > secondNumber){
          return firstNumber;
      } else if(firstNumber < secondNumber){
          return secondNumber;
      } else {
          return irrelevantNumber;
      }
    }

    public int isbiggerThreeInt(int firstNumber, int secondNumber, int thirdNumber, int irrelevantNumber1, int irrelevantNumber2, int irrelevantNumber3, int irrelevantNumber4 ) {

        if(firstNumber == secondNumber && secondNumber > thirdNumber){
            return irrelevantNumber1;
        }
        else if(firstNumber == secondNumber && secondNumber < thirdNumber){
            return irrelevantNumber2;
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
        else if(firstNumber == secondNumber && firstNumber == thirdNumber){
            return irrelevantNumber3;
        }
        else{
            return irrelevantNumber4;
        }
    }




    }

