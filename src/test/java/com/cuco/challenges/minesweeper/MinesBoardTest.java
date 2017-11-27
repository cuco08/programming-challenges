package com.cuco.challenges.minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinesBoardTest {

	@Test
	public void testPrint_4x4board() {
		final short n = 4;
		final short m = 4;
		final MinesBoard board = new MinesBoard(n, m, "*........*......");
		System.out.println("Field # :");
		board.print();
		assertTrue(true);
	}
	
	@Test
	public void testPrint_3x5board() {
		final short n = 3;
		final short m = 5;
		final MinesBoard board = new MinesBoard(n, m, "**.........*...");
		System.out.println("Field # :");
		board.print();
		assertTrue(true);
	}
	
	@Test
	public void testIsValidSafeSquare_Valid() {
		final short n = 6;
		final short m = 8;
		final MinesBoard board = new MinesBoard(n, m, ".**...*.*.**....**............***..*...*...*.**.");
		System.out.println("Field # :");
		board.print();
		assertTrue(board.isValidSafeSquare((short)0, (short)0));
		assertFalse(board.isValidSafeSquare((short)-1, (short)0));
		assertFalse(board.isValidSafeSquare((short)1, (short)-1));
		assertTrue(board.isValidSafeSquare((short)3, (short)3));
		assertFalse(board.isValidSafeSquare((short)4, (short)3));
		assertFalse(board.isValidSafeSquare((short)6, (short)0));
	}
	
	@Test
	public void testResolve_6x8board() {
		final short n = 6;
		final short m = 8;
		final MinesBoard board = new MinesBoard(n, m, ".**.....*.**....**............***..*...*...*.**.");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(6, board.getValue((short)1, (short)1));
	}
	
	@Test
	public void testResolve_1x1board_Safe() {
		final short n = 1;
		final short m = 1;
		final MinesBoard board = new MinesBoard(n, m, ".");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(0, board.getValue((short)0, (short)0));
	}
	
	@Test
	public void testResolve_1x1board_Mined() {
		final short n = 1;
		final short m = 1;
		final MinesBoard board = new MinesBoard(n, m, "*");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(-1, board.getValue((short)0, (short)0));
	}
	
	@Test
	public void testResolve_4x4board() {
		final short n = 4;
		final short m = 4;
		final MinesBoard board = new MinesBoard(n, m, "*........*......");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(2, board.getValue((short)1, (short)1));
	}
	
	@Test
	public void testResolve_3x5board() {
		final short n = 3;
		final short m = 5;
		final MinesBoard board = new MinesBoard(n, m, "**.........*...");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(2, board.getValue((short)1, (short)2));
	}
	
	@Test
	public void testResolve_5x5board_AllSafe() {
		final short n = 5;
		final short m = 5;
		final MinesBoard board = new MinesBoard(n, m, ".........................");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(0, board.getValue((short)3, (short)3));
	}
	
	@Test
	public void testResolve_5x5board_AllMined() {
		final short n = 5;
		final short m = 5;
		final MinesBoard board = new MinesBoard(n, m, "*************************");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(-1, board.getValue((short)3, (short)3));
	}
	
	@Test
	public void testResolve_25x25board() {
		final short n = 25;
		final short m = 25;
		final MinesBoard board = new MinesBoard(n, m, "***...*****......*.*.**.........................*..***......*.*.**............***......*.*.**.........**...*****......*.*.**.........................*..***......*.*.**............***......*.*.**.............*..***...***......*.*.**...*......*.*.**.............*..***...***......*.*.**...............*..***...***......*.*.**...*......*.*.**.............*..***...***......*.*.**...............*.*.**...............*..***...***......*.*.**...*......*.*.**.............*..***...***......*.*.**..........*.*.**...............*..***...***......*.*.**...*......*.*.**.............*..***...***......*.*.**................**..........");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(-1, board.getValue((short)0, (short)0));
	}
	
	@Test
	public void testResolve_1x100board() {
		final short n = 1;
		final short m = 100;
		final MinesBoard board = new MinesBoard(n, m, "...***...*****......*.*.**..............**..**.....**.****.........*........***...***.....****......");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(0, board.getValue((short)0, (short)7));
	}
	
	@Test
	public void testResolve_100x1board() {
		final short n = 100;
		final short m = 1;
		final MinesBoard board = new MinesBoard(n, m, "...***...*****......*.*.**..............**..**.....**.****.........*........***...***.....****......");
		System.out.println("Field # :");
		board.print();
		board.resolve();
		board.print();
		assertEquals(-1, board.getValue((short)5, (short)0));
	}
}

