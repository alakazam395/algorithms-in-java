package com.alakazam.searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {
    private final int[] arr = { 2, 3, 4, 10, 40 };

    @DisplayName("Test check for search success")
    @Test
    public void linearSearchAlgorithmCheckSuccess() {
        int x = 4;
        int expected = 2;
        int result = LinearSearch.search(arr, arr.length, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        System.out.println("result: " + result +" - expected: " + expected);
        System.out.println((result == expected ? "assertion is TRUE\n" : "assertion is FALSE\n"));
        assertEquals(2, result);
    }

    @DisplayName("Test check for search failed")
    @Test
    public void linearSearchAlgorithmCheckFailed() {
        int x = 10;
        int expected = 0;
        int result = LinearSearch.search(arr, arr.length, x);if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        System.out.println("result: " + result +" - expected: " + expected);
        System.out.println((result == expected ? "assertion is FALSE\n" : "assertion is TRUE\n"));
        assertNotEquals(expected, result);
    }
}
