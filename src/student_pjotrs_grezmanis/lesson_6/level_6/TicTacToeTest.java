package student_pjotrs_grezmanis.lesson_6.level_6;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest fieldTest = new TicTacToeTest();
        fieldTest.testCreateField();
    }
    public void testCreateField() {
        int[][] field = new TicTacToe().createField();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                String message = String.format("Field[%s][%s] ", i, j);
                String status = field[i][j] == -1 ? "OK" : "Failed";
                System.out.println(message + status);
            }
        }
    }

}