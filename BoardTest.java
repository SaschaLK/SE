package HA1507;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {
	
	@Test
	public void leeresBoardTest() {
		Board board = new Board();
		assertFalse(board.hasWinner());
	}
	
	@Test
	public void validMarkNoWinnerTest() throws InvalidPositionExcpetion{
		Board board = new Board();
		board.setMark("X", 1, 1);
		assertFalse(board.hasWinner());
	}
	
	@Test
	public void validMarkWinnerTest() throws InvalidPositionExcpetion{
		Board board = new Board();
		board.setMark("X", 0, 0);
		board.setMark("X", 1, 0);
		board.setMark("X", 2, 0);
		assertTrue(board.hasWinner());
	}
	
	@Test(expected = InvalidPositionExcpetion.class)
	public void validPostionTest() throws InvalidPositionExcpetion{
		Board board = new Board();
		board.setMark("X", 4, 0);
	}

}
