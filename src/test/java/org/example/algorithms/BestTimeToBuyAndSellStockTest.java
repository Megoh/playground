package org.example.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BestTimeToBuyAndSellStockTest {
    @Test
    void testIncreasingPrices() {
        int[] prices = {1, 3, 4};

        assertEquals(3, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithIncreaseAndDrop() {
        int[] prices = {1, 3, 4, 0};

        assertEquals(3, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithIncreaseAndDoubleDrop() {
        int[] prices = {1, 3, 4, 0, -1};

        assertEquals(3, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithIncreaseAndDropFollowedByIncrease() {
        int[] prices = {1, 3, 4, 0, 2};

        assertEquals(3, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithIncreaseDropAndRecovery() {
        int[] prices = {1, 3, 4, 1, 5};

        assertEquals(4, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithIncreaseDropAndSignificantRecovery() {
        int[] prices = {1, 3, 4, 2, 6};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithTwoDrops() {
        int[] prices = {1, 3, 4, 2, 6, 0};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithMultipleFluctuations() {
        int[] prices = {1, 3, 4, 2, 6, 0, 3};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithMultipleFluctuationsAndIncrease() {
        int[] prices = {1, 3, 4, 2, 6, 0, 4};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithMultipleFluctuationsAndHigherIncrease() {
        int[] prices = {1, 3, 4, 2, 6, 0, 5};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }

    @Test
    void testPricesWithMultipleFluctuationsAndHighestAtIndexZero() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStocks(prices));
    }
}
