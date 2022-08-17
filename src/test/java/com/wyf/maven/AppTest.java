package com.wyf.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testSayHello() {
        App app = new App();
        int result = app.addition(4,5);
        assertEquals(4+5, result);
    }
}