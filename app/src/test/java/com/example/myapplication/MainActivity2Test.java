package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainActivity2Test
{
    @Test
    public void multiply() {
        assertEquals(700, 70 *10);
    }
    public void addition_isCorrect() {
        assertEquals(22, 32 -10);
    }
    public void divicion() {
        assertEquals(453, 906 /2);
    }
}