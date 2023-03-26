package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmount100() {
        int amount = 100;
        int expected = 900;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmount1() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmount1500() {
        int amount = 1500;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

}
