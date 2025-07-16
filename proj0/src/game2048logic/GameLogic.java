package game2048logic;

import game2048rendering.Side;
import static game2048logic.MatrixUtils.rotateLeft;
import static game2048logic.MatrixUtils.rotateRight;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    /** Moves the given tile up as far as possible, subject to the minR constraint.
     *
     * @param board the current state of the board
     * @param r     the row number of the tile to move up
     * @param c -   the column number of the tile to move up
     * @param minR  the minimum row number that the tile can land in, e.g.
     *              if minR is 2, the moving tile should move no higher than row 2.
     * @return      if there is a merge, returns the 1 + the row number where the merge occurred.
     *              if no merge occurs, then return 0.
     */
    public static int moveTileUpAsFarAsPossible(int[][] board, int r, int c, int minR) {
        // TODO: Fill this in in tasks 2, 3, 4
        int value = board[r][c];
        int targetRow = r;
        while (targetRow > 0 && board[targetRow -1][c] == 0 && targetRow > minR) {
            targetRow -=1;
        }

        board[targetRow][c] = value;
        if(targetRow != r){
            board[r][c] = 0;
        }

        int mergeRow = targetRow;
        if(targetRow>0 && targetRow > minR){
            if(board[targetRow][c] == board[targetRow-1][c] && (board[targetRow][c] !=0)){
                mergeRow -= 1;
                board[mergeRow][c] = value + value;
                if(targetRow != mergeRow){
                    board[targetRow][c] = 0;
                }
                return mergeRow + 1;
            }
        }
        return 0;
    }

    /**
     * Modifies the board to simulate the process of tilting column cmu7=
     * upwards.
     *
     * @param board     the current state of the board
     * @param c         the column to tilt up.
     */
    public static void tiltColumn(int[][] board, int c) {
        // TODO: fill this in in task 5
        int minR = 0;
        for(int i = 0; i <= 3; i ++){
            int new_minR = moveTileUpAsFarAsPossible(board,i,c,minR);
            if(new_minR>minR){
                minR = new_minR;
            }
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting all columns upwards.
     *
     * @param board     the current state of the board.
     */
    public static void tiltUp(int[][] board) {
        // TODO: fill this in in task 6
        return;
    }

    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        // TODO: fill this in in task 7
        if (side == Side.EAST) {
            return;
        } else if (side == Side.WEST) {
            return;
        } else if (side == Side.SOUTH) {
            return;
        } else {
            return;
        }
    }
}
