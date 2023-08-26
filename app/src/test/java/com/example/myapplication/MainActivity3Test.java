package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainActivity3Test
{

    @Test
    public void multiply() {
        assertEquals(80, 8 *10);
    }
    public void addition_isCorrect() {
        assertEquals(330, 320+10);
    }
    public void divicion() {
        assertEquals(350, 700 /2);
    }

}