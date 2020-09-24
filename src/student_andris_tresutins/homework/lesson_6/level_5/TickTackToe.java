package student_andris_tresutins.homework.lesson_6.level_5;


 class TickTackToe {
     public static void main(String[] args) {
         TickTackToe test = new TickTackToe();
         System.out.println(test.isDrawPosition(test.tickTackArrayThree()));
     }


    public int[][] tickTackArray(){
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;

        array[1][0] = 0;
        array[1][1] = 0;
        array[1][2] = 1;

        array[2][0] = 1;
        array[2][1] = 0;
        array[2][2] = -1;


        return array;
    }

     public int[][] tickTackArrayTwo(){
         int[][] array = new int[3][3];
         array[0][0] = 1;
         array[0][1] = 0;
         array[0][2] = 1;

         array[1][0] = 0;
         array[1][1] = 0;
         array[1][2] = 1;

         array[2][0] = 1;
         array[2][1] = 0;
         array[2][2] = -1;


         return array;
     }

     public int[][] tickTackArrayThree(){
         int[][] array = new int[3][3];
         array[0][0] = 1;
         array[0][1] = 0;
         array[0][2] = 1;

         array[1][0] = 0;
         array[1][1] = 1;
         array[1][2] = 1;

         array[2][0] = 1;
         array[2][1] = 0;
         array[2][2] = 1;


         return array;
     }

     public int[][] tickTackArrayDraw(){
         int[][] array = new int[3][3];
         array[0][0] = 0;
         array[0][1] = 1;
         array[0][2] = 0;

         array[1][0] = 1;
         array[1][1] = 1;
         array[1][2] = 0;

         array[2][0] = 1;
         array[2][1] = 0;
         array[2][2] = 1;


         return array;
     }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean win = false;
        if(field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck ){
            win = true;
        }
        else if(field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck ){
            win = true;
        }
        else if(field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck ){
            win = true;
        }
        else{
            win = false;
        }

        return win;
    }

     public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
         boolean win = false;
         if(field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck ){
             win = true;
         }
         else if(field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck ){
             win = true;
         }
         else if(field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck ){
             win = true;
         }
         else{
             win = false;
         }

         return win;
     }

     public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){

         boolean win = false;
         if(field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck ){
             win = true;
         }
         else if(field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck ){
             win = true;
         }
         else{
             win = false;
         }

         return win;
     }

     public boolean isWinPosition(int[][] field, int playerToCheck){

         boolean win = false;
         if(field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck ){
             win = true;
         }
         else if(field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck ){
             win = true;
         }
         else if(field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck ){
             win = true;
         }else if(field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck ){
             win = true;
         }
         else if(field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck ){
             win = true;
         }
         else if(field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck ){
             win = true;
         } else if(field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck ){
             win = true;
         }
         else if(field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck ){
             win = true;
         }
         else{
             win = false;
         }

         return win;

     }

     public boolean isDrawPosition(int[][] field){
         boolean draw = false;
         if(field[0][0] == field[0][1]  && field[0][1] == field[0][2] ){
             draw = false;
         }
         else if(field[1][0] == field[1][1]  && field[1][1] == field[1][2] ){
             draw = false;
         }
         else if(field[2][0] == field[2][1]  && field[2][1] == field[2][2] ){
             draw = false;
         }else if(field[0][0] == field[1][0]  && field[1][0] == field[2][0] ){
             draw = false;
         }
         else if(field[0][1] == field[1][1]  && field[1][1] == field[2][1] ){
             draw = false;
         }
         else if(field[0][2] == field[1][2] && field[1][2] == field[2][2] ){
             draw = false;

         } else if(field[0][0] == field[1][1] && field[1][1] ==  field[2][2] ){
             draw = false;
         }
         else if(field[0][2] == field[1][1] && field[1][1] == field[2][0] ){
             draw = false;
         }
         else{
             draw = true;
         }

        return draw;
     }
}
