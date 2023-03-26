package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    @Test
    public void testRemain() {
        int amount = 100;
        int expected = 900;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testRemain1() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testRemain2() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void testRemain3() {
        int amount = 1500;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

}
