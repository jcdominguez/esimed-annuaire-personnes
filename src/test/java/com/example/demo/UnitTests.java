package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTests {


    @Test
    void testAdd() {
            Calculator calculator = new Calculator();
            int result = calculator.add(2,3);
            assertEquals(5,result);
    }

}
