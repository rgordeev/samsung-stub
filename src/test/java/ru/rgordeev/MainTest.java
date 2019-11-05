package ru.rgordeev;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    /**
     * 6 DIGIT
     * 15 NUM
     * 125 OTHER
     *
     */
    @Test
    public void task1test() {
        Assert.assertEquals("DIGIT", Main.task1(6));
        Assert.assertEquals("NUM", Main.task1(15));
        Assert.assertEquals("OTHER", Main.task1(125));
    }
}
