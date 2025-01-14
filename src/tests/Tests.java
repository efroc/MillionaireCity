package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
    
    private int minX = 0;
    private int maxX = 100;
    private int minY = 0;
    private int maxY = 100;

    @Test
    public void init() {
        int cases = (maxX - minX) * (maxY - minY);
        assertEquals(10000, cases);
    }
}
