package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySumTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(2, solution.subarraySum(new int[]{1, 2, 3}, 3));
        assertEquals(4, solution.subarraySum(new int[]{1, 1,-1,-1,1,-1,1,1}, 2));
    }
}