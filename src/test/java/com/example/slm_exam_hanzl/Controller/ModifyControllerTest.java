package com.example.slm_exam_hanzl.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifyControllerTest {
    @Test
    void testStringModify(){
        // Arrange
        ModifyController mc = new ModifyController();

        // Act
        String result = mc.modifyString("hello");

        // Assert
        assertEquals(result, "hElLo");
    }
}