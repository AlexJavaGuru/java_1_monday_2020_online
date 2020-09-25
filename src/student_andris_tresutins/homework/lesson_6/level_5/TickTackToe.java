package student_andris_tresutins.homework.lesson_6.level_5;


import java.util.Scanner;

class TickTackToe {
     public static void main(String[] args) {
         TickTackToe test = new TickTackToe();
         System.out.println(test.isDrawPosition(test.tickTackArrayThree()));
         System.out.println(test.getNextMove());
     }

     public Move getNextMove() {
         // запросите у пользователя с консоли две координаты
         Scanner scan = new Scanner(System.in);
         System.out.println("enter y coordinate ( only 0 or 1 or 2)");
             int y = scan.nextInt();
             if (y != 0 && y != 1 && y != 2){
                 System.out.println("error");
             }

         System.out.println("enter x coordinate ( only 0 or 1 or 2)");
         int x = scan.nextInt();
         if (x != 0 && x != 1 && x != 2){
             System.out.println("error");

         }

         // клетки куда хочет походить игрок
         // создайте экземпляр класса Move и передайте ему
         // в конструктор введённые пользователем координаты
         // верните созданный объект Move из метода.

         return new Move(x,y);
     }


     public int[][] createField(){
         int[][] arr = new int[3][3];
         for(int i = 0; i< arr.length; i++)
             for (int j = 0; j < arr.length; j++) {
                 arr[i][j] = -1;
             }
         return arr;
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
