package tech.edwyn;

/**
 * Hello world!
 *
 */
public class Game
{
    private StringBuffer board;

    public Game() {
        this.board = new StringBuffer("_________");
    }

    public Game(CharSequence init) {
        this.board = new StringBuffer(init);
    }

    /*
     * Return true if the player has won
     * Checks all the horizontal lines
    */
    public boolean isWinner(char player) {
        if(this.board.charAt(0) == player && this.board.charAt(1) == this.board.charAt(0) && this.board.charAt(2) == this.board.charAt(1)) {
            return true;
        }
        if(this.board.charAt(3) == player && this.board.charAt(4) == this.board.charAt(3) && this.board.charAt(5) == this.board.charAt(4)) {
            return true;
        }
        if(this.board.charAt(6) == player && this.board.charAt(7) == this.board.charAt(6) && this.board.charAt(8) == this.board.charAt(7)) {
            return true;
        }
        return false;
    }

    public int nextMove(char player) {
        for(int i = 0; i < 9; i++) {
            if(this.board.charAt(i) == '_') {
                if(Game.play(this, i, player).isWinner(player)) {
                    return i;
                }
            }
        }
        return this.board.indexOf("_");
    }

    public static Game play(Game game, int pos, char player) {
        if(game.board.charAt(pos) != '_') {
            throw new IllegalArgumentException("Cannot play on a non-empty position");
        }
        StringBuffer newBuf = new StringBuffer(game.board);
        newBuf.setCharAt(pos, player);
        return new Game(newBuf);
    }
}
