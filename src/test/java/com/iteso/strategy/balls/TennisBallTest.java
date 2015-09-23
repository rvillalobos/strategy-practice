package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class TennisBallTest {
    @Test
    public void testTennisBall() {
        TennisBall tennisBall = new TennisBall();
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
