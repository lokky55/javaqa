package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathServiceTest {
    @Test
    public void test() {
        MathService service = new MathService();
        int actual = service.crazyCount(400);
        int expected = 21;
        Assertions.assertEquals(expected, actual);
    }
 }
