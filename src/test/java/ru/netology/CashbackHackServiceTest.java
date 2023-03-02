package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() { // Тестируем случай, когда сумма покупки меньше граничных значений
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int actual = service.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() { // Тестируем случай, когда сумма покупки больше граничных значений
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}