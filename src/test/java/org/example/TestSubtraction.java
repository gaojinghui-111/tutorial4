package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubtraction {
    @Test
    void subtraction(){
        Calc c =new Calc();
        assertEquals(10,c.subtract(20,10));
    }
}
