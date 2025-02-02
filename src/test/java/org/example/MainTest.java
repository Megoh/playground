package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainTest {
    @Test
    void testValid1x1() {
        int[][] grid = {
                {0},
        };

        assertEquals(1, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testInvalid1x1() {
        int[][] grid = {
                {1},
        };

        assertEquals(-1, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testValidPath2x2() {
        int[][] grid = {
                {0, 1},
                {0, 0},
        };

        assertEquals(2, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testInvalidPath2x2() {
        int[][] grid = {
                {0, 1},
                {1, 1},
        };

        assertEquals(-1, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testValidPath3x3() {
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0},
        };

        assertEquals(4, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testValidDiagonalPath3x3() {
        int[][] grid = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0},
        };

        assertEquals(3, Main.shortestPathBinaryMatrix(grid));
    }

    @Test
    void testInvalidPath4x4() {
        int[][] grid = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0},
        };

        assertEquals(-1, Main.shortestPathBinaryMatrix(grid));
    }
}
