package tictactoe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.example.Board;

public class TictactoeTest {
    Board board;
    @BeforeEach
    void setUp() {
        board = new Board();
    }
    @Test
    void testWinInRow() {
        board.placeMark(0, 0, "🦋");
        board.placeMark(0, 1, "🦋");
        board.placeMark(0, 2, "🦋");
        assertTrue(board.checkWin("🦋"));
    }
    @Test
    void testWinInColumn() {
        board.placeMark(0, 0, "🦋");
        board.placeMark(1, 0, "🦋");
        board.placeMark(2, 0, "🦋");
        assertTrue(board.checkWin("🦋"));
    }
    @Test
    void testWinInDiagonal1() {
        board.placeMark(0, 0, "🦋");
        board.placeMark(1, 1, "🦋");
        board.placeMark(2, 2, "🦋");
        assertTrue(board.checkWin("🦋"));
    }
    @Test
    void testWinInDiagonal2() {
        board.placeMark(0, 2, "🦋");
        board.placeMark(1, 1, "🦋");
        board.placeMark(2, 0, "🦋");
        assertTrue(board.checkWin("🦋"));
    }
    @Test
    void testNoWin() {
        board.placeMark(0, 0, "🦋");
        board.placeMark(1, 1, "🦋");
        assertFalse(board.checkWin("🦋"));
    }
    @Test
    void testIsFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.placeMark(i, j, "🦋");
            }
        }
        assertTrue(board.isFull());
    }
    @Test
    void testIsNotFull() {
        board.placeMark(0, 0, "🦋");
        assertFalse(board.isFull());
    }
    @Test
    void testPlaceMark() {
        assertTrue(board.placeMark(0, 0, "🦋"));
        assertFalse(board.placeMark(0, 0, "🦋"));
    }
}