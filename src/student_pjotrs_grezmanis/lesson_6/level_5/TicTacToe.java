package student_pjotrs_grezmanis.lesson_6.level_5;

class TicTacToe {

    public static boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean rowIsMatched = true;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != playerToCheck) {
                    rowIsMatched = false;
                    break;
                }
            }
            if (rowIsMatched) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean columbIsMatched = true;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] != playerToCheck) {
                    columbIsMatched = false;
                    break;
                }
            }
            if (columbIsMatched) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean DiagonalsIsMatching = true;
            playerToCheck = i;
            if (field[i][i] != field[i + 1][i + 1]) {
                DiagonalsIsMatching = false;
                break;
            }


            if (DiagonalsIsMatching) {
                return true;

            }
        }

        return false;
    }

    public static boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck && field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck) ||
                    (field[0][i] == playerToCheck && field[1][i] == playerToCheck &&
                            field[2][i] == playerToCheck))
                return true;
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck &&
                    field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck && field[1][1] == playerToCheck &&
                            field[0][2] == playerToCheck))
                return true;


        }
        return false;
    }

    public static boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field.length; j++)
                if (field[i][j] == -1)
                    return false;
        return true;
    }

}

