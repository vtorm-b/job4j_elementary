package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayIs6() {
        int way = ChessBoard.way(2, 0, 4, 2);
        assertThat(way, is(3));
    }

   @Test
    public void wayIs5() {
        int way = ChessBoard.way(4, 0, 5, 2);
        assertThat(way, is(2));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 0, 0, 2);
        assertThat(way, is(2));
    }
}

