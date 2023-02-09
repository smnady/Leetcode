package LeetCode.Medium.ValidSudoku;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = 0, n2 = 0;
                for (int k = j; k < 9; k++) {
                    if (board[i][k]=='.') continue;
                    if (board[i][j]==board[i][k]) n++;
                }
                for (int k = i; k < 9; k++) {
                    if (board[k][j]=='.') continue;
                    if (board[i][j]==board[k][j]) n2++;
                }
                if (n>1 || n2>1) return false;
            }
        }
        for (int i = 0; i < 7; i+=3) {
            for (int j = 0; j < 7 ; j+=3) {
                Set <Integer> st = new HashSet<>();
                int z = 0;
                for (int l = i; l<i+3; l++) {
                    for (int m = j; m<j+3; m++) {
                        char c = board[l][m];
                        z++;
                        if (c == '.') st.add(-10-z);
                        else st.add(Character.digit(c, 10));
                    }
                }
                if (st.size()!=9) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = new char[][] {{'5','3','.','.','7','.','.','.','.'},
                                        {'6','.','.','1','9','5','.','.','.'},
                                        {'.','9','8','.','.','.','.','6','.'},
                                        {'8','.','.','.','6','.','.','.','3'},
                                        {'4','.','.','8','.','3','.','.','1'},
                                        {'7','.','.','.','2','.','.','.','6'},
                                        {'.','6','.','.','.','.','2','8','.'},
                                        {'.','.','.','4','1','9','.','.','5'},
                                        {'.','.','.','.','8','.','.','7','9'}};

        char[][] board2 = new char[][] {{'8','3','.','.','7','.','.','.','.'},
                                        {'6','.','.','1','9','5','.','.','.'},
                                        {'.','9','8','.','.','.','.','6','.'},
                                        {'1','.','.','.','6','.','.','.','3'},
                                        {'4','.','.','8','.','3','.','.','1'},
                                        {'7','.','.','.','2','.','.','.','6'},
                                        {'.','6','.','.','.','.','2','8','.'},
                                        {'.','.','.','4','1','9','.','.','5'},
                                        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
    }
}
