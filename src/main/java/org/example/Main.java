package org.example;

import org.example.algorithms.ShortestPathBinaryMatrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
        };

        System.out.println(ShortestPathBinaryMatrix.shortestPathBinaryMatrix(grid));
    }
}