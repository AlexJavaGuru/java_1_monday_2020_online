package student_artur_martinenko.homework.lesson_4.level_x;

class FizzBuzz {

    public String detect(int number){

        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if(number % 5 == 0){
            return "Buzz";
        } else if(number % 3 == 0){
            return "Fizz";
        }else{
            return String.valueOf(number);
        }


    }

}
