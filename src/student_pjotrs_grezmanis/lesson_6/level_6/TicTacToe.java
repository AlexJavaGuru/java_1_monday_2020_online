package student_pjotrs_grezmanis.lesson_6.level_6;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args){
        TicTacToe tacToe = new TicTacToe();
        Move move = tacToe.getNextMove();
        System.out.println("Your X is " + move.getX());
        System.out.println("Your Y is " + move.getY());
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;

    }

    public Move getNextMove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter coordinates X");
        int x = input.nextInt();
        System.out.println("Please enter coordinates Y");
        int y = input.nextInt();
        return new Move(x,y);
    }
    public void printFieldToConsole(int[][] field) {

    }

}