package tech.edwyn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTest
{

    @Test
    public void new_game_has_no_winner()
    {
        Game game = new Game();
        assertFalse( game.isWinner('X') );
        assertFalse( game.isWinner('O') );
    }

    @Test
    public void game_has_winner_X_when_line_is_complete()
    {
        Game game = new Game("O_OXXXO__");
        assertTrue( game.isWinner('X') );
        assertFalse( game.isWinner('O') );
    }

    @Test
    public void game_has_winner_0_when_line_is_complete()
    {
        Game game = new Game("__XXX_000");
        assertFalse( game.isWinner('X') );
        assertTrue( game.isWinner('0') );
    }

    @Test
    public void nextMove_gives_a_winning_position_when_it_exists() {
        Game game = new Game("X_XOO____");
        assertEquals(1, game.nextMove('X'));
    }

    @Test
    public void nextMove_gives_a_firt_empty_cell_when_no_winning_move() {
        Game game = new Game("OX_OX__XO");
        assertEquals(2, game.nextMove('X'));
    }

    @Test
    public void nextMove_gives_neg_one_when_there_is_no_empty_cell_and_no_winning_move() {
        Game game = new Game("OXOOXXXOO");
        assertEquals(-1, game.nextMove('X'));
    }

    @Test
    public void playing_a_winning_move_should_make_player_winner() {
        Game game = new Game("X_XOO____");
        assertFalse(game.isWinner('X'));
        assertEquals(1, game.nextMove('X'));
        Game newGame = Game.play(game, 1, 'X');
        assertTrue(newGame.isWinner('X'));
    }

    @Test
    public void playing_on_an_non_empty_cell_should_throw() {
        Game game = new Game("X_XOO____");
        assertThrows(IllegalArgumentException.class, () -> Game.play(game, 2, 'X'));
    }
}
