import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }

    static boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> rowSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') continue;
                if (rowSet.contains(board[row][i])) return false;
                rowSet.add(board[row][i]);
            }
        }

        for (int col = 0; col < 9; col++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') continue;
                if (colSet.contains(board[i][col])) return false;
                colSet.add(board[i][col]);
            }
        }

        for (int sqaure = 0; sqaure < 9; sqaure++) {
            Set<Character> squareSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sqaure / 3) * 3 + i;
                    int col = (sqaure % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (squareSet.contains(board[row][col])) return false;
                    squareSet.add(board[row][col]);
                }
            }
        }

        return true;
    }
}