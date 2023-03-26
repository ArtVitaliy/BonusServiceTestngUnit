package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    @Test
    public void testShouldCalculateIfAmount5500() {
        int amount = 5500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testShouldCalculateIfAmount1() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testShouldCalculateIfAmount1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testShouldCalculateIfAmount1500() {
        int amount = 1500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

}
