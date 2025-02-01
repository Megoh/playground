package org.example;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
        };

        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int startPos = grid[0][0];
        int goalPos = grid[grid.length - 1][grid.length - 1];

        if (startPos == 1 || goalPos == 1) {
            return -1;
        }

        ArrayDeque<int[]> paths = new ArrayDeque<>();

        paths.add(new int[]{0, 0, 1});
        int row, col, steps;

        boolean[][] visited = new boolean[grid.length][grid.length];
        visited[0][0] = true;

        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        do {
            int[] current = paths.poll();
            if (current == null) return -1;
            row = current[0];
            col = current[1];
            steps = current[2];

            for (int[] d : directions) {
                int newRow = row + d[0];
                int newCol = col + d[1];

                if (isValidMove(newRow, newCol, grid, visited)) {
                    paths.add(new int[]{newRow, newCol, steps + 1});
                    visited[newRow][newCol] = true;
                }
            }

        } while (!paths.isEmpty() && !(row == grid.length - 1 && col == grid.length - 1));

        if (row == grid.length - 1 && col == grid.length - 1) {
            return steps;
        }

        return -1;
    }

    private static boolean isValidMove(int newRow, int newCol, int[][] grid, boolean[][] visited) {
        if (newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid.length) {
            return false;
        }

        if (grid[newRow][newCol] == 1) {
            return false;
        }

        if (visited[newRow][newCol]) {
            return false;
        }

        return true;
    }
}