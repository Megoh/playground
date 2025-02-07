package org.example.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class TwoSumTest {

    @Test
    void testTwoZeroes() {
        assertArrayEquals(new int[] {0, 1},
                TwoSum.sumTwoNumbersAndReturnTheirIndices(new int[] {0 , 0}, 0));
    }

    @Test
    void testTwoDifferentElements() {
        assertArrayEquals(new int[] {0, 1},
                TwoSum.sumTwoNumbersAndReturnTheirIndices(new int[] {0 , 1}, 1));
    }

    @Test
    void testTwoOnes() {
        assertArrayEquals(new int[] {0, 1},
                TwoSum.sumTwoNumbersAndReturnTheirIndices(new int[] {1 , 1}, 2));
    }


    @Test
    void testSmallerIncrement() {
        assertArrayEquals(new int[] {0, 1},
                TwoSum.sumTwoNumbersAndReturnTheirIndices(new int[] {2 , 3, 4}, 5));
    }


    @Test
    void testBiggerIncrement() {
        assertArrayEquals(new int[] {1, 2},
                TwoSum.sumTwoNumbersAndReturnTheirIndices(new int[] {2, 3, 4}, 7));
    }
}
